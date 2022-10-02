package org.mcsoft.ringapi.model.device;

import lombok.Data;

@Data
public class CameraChimeSettings {
    public int type;
    public boolean enable;
    public int duration;
}
