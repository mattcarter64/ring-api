package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CvProperties {
  @JsonProperty("person_detected")
  private String personDetected;
  @JsonProperty("stream_broken")
  private String streamBroken;
  @JsonProperty("detection_type")
  private String detectionType;
}
