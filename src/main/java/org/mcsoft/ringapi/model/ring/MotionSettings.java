package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MotionSettings {
  @JsonProperty("enable_audio")
  private boolean enableAudio;
  @JsonProperty("motion_detection_enabled")
  private boolean motionDetectionEnabled;
  @JsonProperty("enable_ir_led")
  private boolean enableIrLed;
  @JsonProperty("advanced_motion_detection_enabled")
  private boolean advancedMotionDetectionEnabled;
  @JsonProperty("advanced_motion_detection_mode")
  private String advancedMotionDetectionMode;
  @JsonProperty("advanced_motion_detection_human_only_mode")
  private boolean advancedMotionDetectionHumanOnlyMode;
  @JsonProperty("advanced_motion_detection_loitering_mode")
  private boolean advancedMotionDetectionLoiteringMode;
  @JsonProperty("motion_snooze_privacy_timeout")
  private int motionSnoozePrivacyTimeout;
  @JsonProperty("advanced_motion_zones_enabled")
  private boolean advancedMotionZonesEnabled;
  @JsonProperty("advanced_motion_zones_type")
  private String advancedMotionZonesType;
  @JsonProperty("enable_indoor_mode")
  private boolean enableIndoorMode;
  @JsonProperty("enable_pir_validation")
  private boolean enablePirValidation;
  @JsonProperty("loitering_threshold")
  private int loiteringThreshold;
  @JsonProperty("enable_rlmd")
  private boolean enableRlmd;
  @JsonProperty("enable_recording")
  private boolean enableRecording;
  @JsonProperty("end_detection")
  private int endDetection;
  @JsonProperty("advanced_motion_recording_human_mode")
  private boolean advancedMotionRecordingHumanMode;
  @JsonProperty("advanced_motion_glance_enabled")
  private boolean advancedMotionGlanceEnabled;
}
