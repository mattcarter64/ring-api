package org.mcsoft.ringapi;

import lombok.extern.slf4j.Slf4j;
import org.mcsoft.ringapi.model.Location;
import org.mcsoft.ringapi.model.auth.RefreshTokenAuth;
import org.mcsoft.ringapi.model.device.Chime;
import org.mcsoft.ringapi.model.device.Device;
import org.mcsoft.ringapi.model.device.ring.RingCamera;
import org.mcsoft.ringapi.model.device.ring.RingChime;
import org.mcsoft.ringapi.model.response.DevicesResponse;
import org.mcsoft.ringapi.model.response.RawLocationsResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Slf4j
public class RingApi {

    private RingRestClient restClient;

    public RingApi(String refreshToken) throws Exception {

        log.debug("refresh token={}", refreshToken);

        restClient = new RingRestClient(new RefreshTokenAuth(refreshToken));

        restClient.start();
    }

    public List<Location> getLocations() throws IOException {

        return fetchAndBuildLocations();
    }

    private List<Location> fetchAndBuildLocations() throws IOException {

        RawLocationsResponse locationsResponse = fetchRawLocations();

        log.debug("raw locations locationsResponse={}", locationsResponse);

        if( locationsResponse.getUserLocations().size() == 0 ) {
            throw new IOException("No locations found");
        }

        Location location = new Location();

        location.setLocationDetails(locationsResponse.getUserLocations().get(0));

        //

        DevicesResponse devices = fetchRingDevices();

        List<RingChime> ringChimes = new ArrayList<>();

        for(Chime chimeData: devices.getChimes()) {
            RingChime chime = new RingChime(chimeData);

            if (chime.getLocationId().equalsIgnoreCase(location.getLocationDetails().getLocationId())) {
                ringChimes.add(chime);
            }
        }

        location.setChimes(ringChimes);

        List<RingCamera> ringCameras = new ArrayList<>();

        for(Device cameraData: devices.getAllCameras()) {
            RingCamera cam = new RingCamera(cameraData);

            if( cam.isCamera() && cam.getLocationId().equalsIgnoreCase(location.getLocationDetails().getLocationId())) {
                ringCameras.add(cam);
            }
        }

        location.setCameras(ringCameras);

//        log.debug("devices locationsResponse={}", devices);

        return new ArrayList<>(Collections.singleton(location));
    }

    private DevicesResponse fetchRingDevices() throws IOException {

        RequestOptions options = new RequestOptions()
                .setUri(restClient.clientApi("ring_devices"));

        DevicesResponse response =restClient.request(options, DevicesResponse.class);

//        List<CameraData> allCameras = new ArrayList<>(response.getDoorbots());
//        allCameras.addAll(response.getAuthorizedDoorbots());
//        allCameras.addAll(response.getStickupCams());
        List<Device> allCameras = new ArrayList<>(response.getDoorbots());
        allCameras.addAll(response.getAuthorizedDoorbots());
        allCameras.addAll(response.getStickupCams());

        response.setAllCameras(allCameras);

        return response;
    }

    private RawLocationsResponse fetchRawLocations() throws IOException {

        RequestOptions options = new RequestOptions()
                .setUri(restClient.deviceApi("locations"));

        return restClient.request(options, RawLocationsResponse.class);
    }
}
