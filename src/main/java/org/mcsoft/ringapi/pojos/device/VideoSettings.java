package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class VideoSettings{
    public boolean encryption_enabled;
    public Object encryption_method;
    public boolean hevc_enabled;
    public Object ignore_zones;
    public Object birton;
    public int brightness;
    public int contrast;
    public int saturation;
    public int ae_level;
    public int ae_mode;
    public Object ae_mask;
    public Object clip_length_min;
    public int clip_length_max;
}
