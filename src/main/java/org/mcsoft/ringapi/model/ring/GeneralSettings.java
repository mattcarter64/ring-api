package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GeneralSettings {
  @JsonProperty("enable_audio_recording")
  private boolean enableAudioRecording;
  @JsonProperty("lite_24x7_enabled")
  private boolean lite24x7Enabled;
  @JsonProperty("offline_motion_event_enabled")
  private boolean offlineMotionEventEnabled;
  @JsonProperty("lite_24x7_subscribed")
  private boolean lite24x7Subscribed;
  @JsonProperty("offline_motion_event_subscribed")
  private boolean offlineMotionEventSubscribed;
  @JsonProperty("firmwares_locked")
  private boolean firmwaresLocked;
  @JsonProperty("utc_offset")
  private String utcOffset;
  @JsonProperty("theft_alarm_enable")
  private boolean theftAlarmEnable;
  @JsonProperty("use_wrapup_domain")
  private boolean useWrapupDomain;
  @JsonProperty("power_mode")
  private String powerMode;
  @JsonProperty("data_collection_enabled")
  private boolean dataCollectionEnabled;
}
