package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DoNotDisturb {
  @JsonProperty("seconds_left")
  private int secondsLeft;
}
