package org.mcsoft.ringapi.model;

import lombok.Data;
import lombok.ToString;
import org.mcsoft.ringapi.model.device.ring.RingCamera;
import org.mcsoft.ringapi.model.device.ring.RingChime;

import java.util.List;

@Data
@ToString
public class Location {
    private UserLocation locationDetails;
    private List<RingCamera> cameras;
    private List<RingChime> chimes;
    private Options options;

    @Data
    private static class Options {
        private boolean hashHubs;
        private boolean hasAlarmBaseStation;
        private int locationModePollingSeconds;
    }

}
