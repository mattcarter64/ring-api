package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Features {
  @JsonProperty("motions_enabled")
  private boolean motionsEnabled;
  @JsonProperty("show_recordings")
  private boolean showRecordings;
  @JsonProperty("advanced_motion_enabled")
  private boolean advancedMotionEnabled;
  @JsonProperty("people_only_enabled")
  private boolean peopleOnlyEnabled;
  @JsonProperty("shadow_correction_enabled")
  private boolean shadowCorrectionEnabled;
  @JsonProperty("motion_message_enabled")
  private boolean motionMessageEnabled;
  @JsonProperty("night_vision_enabled")
  private boolean nightVisionEnabled;
}
