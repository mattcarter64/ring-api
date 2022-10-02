package org.mcsoft.ringapi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.mcsoft.ringapi.model.ring.BaseStation;
import org.mcsoft.ringapi.model.ring.BeamBridge;
import org.mcsoft.ringapi.pojos.device.Chime;
import org.mcsoft.ringapi.pojos.device.Device;
import org.mcsoft.ringapi.pojos.device.Doorbot;
import org.mcsoft.ringapi.pojos.device.StickupCam;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class DevicesResponse extends ExtendedResponse {
//    private List<CameraData> doorbots;
    private List<Doorbot> doorbots;
    @JsonProperty("authorized_doorbots")
//    private List<CameraData> authorizedDoorbots;
    private List<Doorbot> authorizedDoorbots;
    @JsonProperty("stickup_cams")
//    private List<CameraData> stickupCams;
    private List<StickupCam> stickupCams;
//    private List<ChimeData> chimes;
    private List<Chime> chimes;
    private List<BaseStation> base_stations;
    private List<BeamBridge> beams_bridges;
//    private List<CameraData> allCameras;
    private List<Device> allCameras;
}
