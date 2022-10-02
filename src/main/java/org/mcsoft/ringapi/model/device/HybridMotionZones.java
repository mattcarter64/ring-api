package org.mcsoft.ringapi.model.device;

import lombok.Data;

@Data
public class HybridMotionZones{
    public Zone zone1;
    public Zone zone2;
    public Zone zone3;
    public boolean advanced_motion_zones_enabled;
    public String advanced_motion_zones_type;
    public AdvancedPirMotionZones advanced_pir_motion_zones;
    public int motion_snooze_privacy_timeout;
    public Object enable_ir;
    public int active_motion_filter;
    public boolean enable_pir_validation;
    public boolean enable_rlmd;
    public AdvancedObjectSettings advanced_object_settings;
    public Object sensitivity;
    public boolean enable_audio;
    public PirSettings pir_settings;
}
