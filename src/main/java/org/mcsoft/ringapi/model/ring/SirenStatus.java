package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SirenStatus {
  @JsonProperty("started_at")
  private String startedAt;
  private String duration;
  @JsonProperty("ends_at")
  private String endsAt;
  @JsonProperty("seconds_remaining")
  private int secondsRemaining;
}
