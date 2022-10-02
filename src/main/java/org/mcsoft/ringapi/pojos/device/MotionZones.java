package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class MotionZones{
    public PirSettings pir_settings;
    public boolean enable_audio;
    public int active_motion_filter;
    public int sensitivity;
    public AdvancedObjectSettings advanced_object_settings;
    public Zone zone1;
    public Zone zone2;
    public Zone zone3;
}
