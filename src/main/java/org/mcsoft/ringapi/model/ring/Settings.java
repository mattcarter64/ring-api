package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Settings {
  @JsonProperty("enable_vod")
  private boolean enableVod;
  @JsonProperty("motion_zones")
  private MotionZones motionZones;
  @JsonProperty("motion_snooze_preset_profile")
  private String motionSnoozePresetProfile;
  @JsonProperty("live_view_preset_profile")
  private String liveViewPresetProfile;
  @JsonProperty("live_view_presets")
  private String[] liveViewPresets;
  @JsonProperty("motion_snooze_presets")
  private String[] motionSnoozePresets;
  @JsonProperty("doorbell_volume")
  private int doorbellVolume;
  @JsonProperty("chime_settings")
  private ChimeSettings chimeSettings;
  @JsonProperty("video_settings")
  private Object videoSettings;
  @JsonProperty("motion_announcement")
  private boolean motionAnnouncement;
  @JsonProperty("stream_setting")
  private int streamSetting;
  @JsonProperty("advanced_motion_detection_enabled")
  private boolean advancedMotionDetectionEnabled;
  @JsonProperty("advanced_motion_detection_human_only_mode")
  private boolean advancedMotionDetectionHumanOnlyMode;
  @JsonProperty("luma_night_threshold")
  private int lumaNightThreshold;
  @JsonProperty("enable_audio_recording")
  private boolean enableAudioRecording;
  @JsonProperty("people_detection_eligible")
  private boolean peopleDetectionEligible;
  @JsonProperty("pir_settings")
  private Object pirSettings;
  @JsonProperty("pir_motion_zones")
  private int pirMotionZones;
  @JsonProperty("floodlight_settings")
  private FloodlightSettings floodlightSettings;
  @JsonProperty("light_schedule_settings")
  private Object lightScheduleSettings;
  @JsonProperty("luma_light_threshold")
  private int lumaLightThreshold;
  @JsonProperty("live_view_disabled")
  private boolean liveViewDisabled;
  @JsonProperty("motion_detection_enabled")
  private boolean motionDetectionEnabled;
  @JsonProperty("power_mode")
  private String powerMode;
  @JsonProperty("sheila_settings")
  private SheilaSettings sheilaSettings;
  @JsonProperty("server_settings")
  private ServerSettings serverSettings;
}
