package org.mcsoft.ringapi.model.device.ring;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.mcsoft.ringapi.pojos.device.Device;

@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class RingChime extends RingBaseDevice {

    public RingChime(Device deviceData) {

        super(deviceData);
    }
}
