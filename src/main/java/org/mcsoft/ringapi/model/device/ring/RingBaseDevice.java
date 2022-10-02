package org.mcsoft.ringapi.model.device.ring;

import lombok.Data;
import org.mcsoft.ringapi.pojos.device.BaseDevice;
import org.mcsoft.ringapi.pojos.device.Device;

@Data
public class RingBaseDevice {

    private final Device deviceData;
    private int id;
    private RingKind deviceType;

    public RingBaseDevice() {
        this.deviceData = null;
        this.id = -1;
        this.deviceType = RingKind.UNKNOWN;
    }

    public RingBaseDevice(Device deviceData) {
        this.deviceData = deviceData;

        this.id = ((BaseDevice)deviceData).getId();
        this.deviceType = ((BaseDevice)deviceData).getRingDeviceKind();
    }

    public RingKind getKind() {
        try {
            return ((BaseDevice) getDeviceData()).getRingDeviceKind();
        } catch (Exception ignored) {
            return RingKind.UNKNOWN;
        }
    }

    public boolean isCamera() {

        switch (getKind()) {
            case doorbell:
            case doorbell_v3:
            case doorbell_v4:
            case doorbell_v5:
            case doorbell_portal:
            case doorbell_scallop:
            case doorbell_scallop_lite:
            case doorbell_graham_cracker:
            case lpd_v1:
            case lpd_v2:
            case lpd_v4:
            case jbox_v1:
            case stickup_cam:
            case stickup_cam_v3:
            case stickup_cam_elite:
            case stickup_cam_lunar:
            case spotlightw_v2:
            case hp_cam_v1:
            case hp_cam_v2:
            case stickup_cam_v4:
            case floodlight_v1:
            case floodlight_v2:
            case floodlight_pro:
            case cocoa_camera:
            case cocoa_doorbell:
            case cocoa_floodlight:
            case stickup_cam_mini:
                return true;
        }

        return false;
    }

    public boolean isChime() {

        switch (getKind()) {
            case chime:
            case chime_pro:
            case chime_v2:
            case chime_pro_v2:
                return true;
        }

        return false;
    }
}
