package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ClientDeviceSettings {
  @JsonProperty("ringtones_enabled")
  private boolean ringtonesEnabled;
  @JsonProperty("people_only_enabled")
  private boolean peopleOnlyEnabled;
  @JsonProperty("advanced_motion_enabled")
  private boolean advancedMotionEnabled;
  @JsonProperty("motion_message_enabled")
  private boolean motionMessageEnabled;
  @JsonProperty("shadow_correction_enabled")
  private boolean shadowCorrectionEnabled;
  @JsonProperty("night_vision_enabled")
  private boolean nightVisionEnabled;
  @JsonProperty("light_schedule_enabled")
  private boolean lightScheduleEnabled;
  @JsonProperty("rich_notifications_eligible")
  private boolean richNotificationsEligible;
  @JsonProperty("show_24x7_lite")
  private boolean show24x7Lite;
  @JsonProperty("show_offline_motion_events")
  private boolean showOfflineMotionEvents;
  @JsonProperty("cfes_eligible")
  private boolean cfesEligible;
  @JsonProperty("show_radar_data")
  private boolean showRadarData;
  @JsonProperty("motion_zone_recommendation")
  private boolean motionZoneRecommendation;
}
