package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CvSettings {
  @JsonProperty("detection_types")
  private DetectionTypes detectionTypes;
  private Threshold threshold;
}
