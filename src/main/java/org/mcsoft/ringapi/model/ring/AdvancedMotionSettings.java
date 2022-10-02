package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdvancedMotionSettings {
  @JsonProperty("active_motion_filter")
  private int activeMotionFilter;
  @JsonProperty("advanced_object_settings")
  private AdvancedObjectSettings advancedObjectSettings;
}
