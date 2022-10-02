package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MotionZones {
  @JsonProperty("enable_audio")
  private boolean enableAudio;
  @JsonProperty("active_motion_filter")
  private int activeMotionFilter;
  private int sensitivity;
  @JsonProperty("advanced_object_settings")
  private Object advancedObjectSettings;
  private Object zone1;
  private Object zone2;
  private Object zone3;
}
