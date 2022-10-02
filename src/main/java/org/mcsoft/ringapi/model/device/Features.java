package org.mcsoft.ringapi.model.device;

import lombok.Data;

@Data
public class Features{
    public boolean motion_zone_recommendation;
    public boolean motions_enabled;
    public boolean show_recordings;
    public boolean show_vod_settings;
    public boolean rich_notifications_eligible;
    public boolean show_24x7_lite;
    public boolean show_offline_motion_events;
    public boolean cfes_eligible;
    public boolean sheila_camera_eligible;
    public boolean sheila_camera_processing_eligible;
    public boolean chime_auto_detect_capable;
    public boolean ringtones_enabled;
    public boolean motion_message_enabled;
    public boolean advanced_motion_enabled;
    public boolean people_only_enabled;
    public boolean shadow_correction_enabled;
    public boolean night_vision_enabled;
    public boolean show_radar_data;
    public String live_view_pip_mode;
}
