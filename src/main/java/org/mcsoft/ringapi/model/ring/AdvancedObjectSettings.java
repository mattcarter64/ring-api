package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdvancedObjectSettings {
  @JsonProperty("human_detection_confidence")
  private String humanDetectionConfidence;
  @JsonProperty("motion_zone_overlap")
  private String motionZoneOverlap;
  @JsonProperty("object_size_maximum")
  private String objectSizeMaximum;
  @JsonProperty("object_size_minimum")
  private String objectSizeMinimum;
  @JsonProperty("object_time_overlap")
  private String objectTimeOverlap;
}
