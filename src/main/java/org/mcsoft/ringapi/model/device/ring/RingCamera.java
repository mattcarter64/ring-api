package org.mcsoft.ringapi.model.device.ring;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.mcsoft.ringapi.pojos.device.Device;

@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class RingCamera extends RingBaseDevice {

    public RingCamera(Device deviceData) {

        super(deviceData);
    }
}
