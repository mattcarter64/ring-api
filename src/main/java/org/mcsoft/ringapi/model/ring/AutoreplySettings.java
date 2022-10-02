package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AutoreplySettings {
  @JsonProperty("delay_ms")
  private int delayMs;
}
