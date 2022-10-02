package org.mcsoft.ringapi.model.device;
import lombok.Data;

import java.util.List;

@Data
public class DoorbotSettings {
    public CvSettings cv_settings;
    public CvPaidFeatures cv_paid_features;
    public ConciergeSettings concierge_settings;
    public OtherPaidFeatures other_paid_features;
    public SheilaSettings sheila_settings;
    public ServerSettings server_settings;
    public ZoneSettings zone_settings;
    public OfflineMotionEventSettings offline_motion_event_settings;
    public Lite24x7 lite_24x7;
    public int enable_vod;
    public int exposure_control;
    public List<Integer> motion_zones;
    public String motion_snooze_preset_profile;
    public List<String> motion_snooze_presets;
    public String live_view_preset_profile;
    public List<String> live_view_presets;
    public int pir_sensitivity_1;
    public int vod_suspended;
    public int doorbell_volume;
    public String vod_status;
    public CameraChimeSettings chime_settings;
    public VideoSettings video_settings;
    public boolean advanced_motion_detection_enabled;
    public AdvancedMotionZones advanced_motion_zones;
    public boolean advanced_motion_detection_human_only_mode;
    public boolean enable_audio_recording;
    public boolean people_detection_eligible;
    public boolean live_view_disabled;
    public IgnoreZones ignore_zones;
    public boolean enable_rich_notifications;
    public boolean rich_notifications_billing_eligible;
    public boolean rich_notifications_face_crop_enabled;
    public int loitering_threshold;
    public List<Object> advanced_motion_detection_types;
    public boolean motion_detection_enabled;
    public String rich_notifications_scene_source;
    public boolean advanced_motion_zones_enabled;
    public String advanced_motion_zones_type;
    public AdvancedPirMotionZones advanced_pir_motion_zones;
}
