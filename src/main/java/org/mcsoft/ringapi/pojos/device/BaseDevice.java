package org.mcsoft.ringapi.pojos.device;

import lombok.Data;
import org.mcsoft.ringapi.model.device.ring.RingKind;

@Data
public abstract class BaseDevice implements Device {

    public int id;
    public String description;
    public String device_id;
    public String time_zone;
    public String firmware_version;
    public String kind;

    public RingKind getRingDeviceKind() {
        try {
            return RingKind.valueOf(kind);
        } catch (Exception ignored) {

        }

        return RingKind.UNKNOWN;
    }
}
