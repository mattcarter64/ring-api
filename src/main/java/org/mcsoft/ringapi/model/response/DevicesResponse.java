package org.mcsoft.ringapi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.mcsoft.ringapi.model.device.Chime;
import org.mcsoft.ringapi.model.device.Device;
import org.mcsoft.ringapi.model.device.Doorbot;
import org.mcsoft.ringapi.model.device.StickupCam;

import java.util.List;


@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class DevicesResponse extends ExtendedResponse {
    private List<Doorbot> doorbots;
    @JsonProperty("authorized_doorbots")
    private List<Doorbot> authorizedDoorbots;
    @JsonProperty("stickup_cams")
    private List<StickupCam> stickupCams;
    private List<Chime> chimes;
    private List<Device> allCameras;

    // TODO deal with these once I have real example response(s)
//    private List<BaseStation> base_stations;
//    private List<BeamBridge> beams_bridges;
}
