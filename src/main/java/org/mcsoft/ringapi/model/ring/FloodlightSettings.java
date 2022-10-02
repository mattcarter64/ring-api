package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class FloodlightSettings {
  private int priority;
  private int duration;
  private int brightness;
  @JsonProperty("always_on")
  private boolean alwaysOn;
  @JsonProperty("always_on_duration")
  private int alwaysOnDuration;
}
