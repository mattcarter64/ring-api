package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class CameraChimeSettings {
    public int type;
    public boolean enable;
    public int duration;
}
