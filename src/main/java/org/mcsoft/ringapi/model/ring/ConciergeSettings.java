package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ConciergeSettings {
  @JsonProperty("alexa_settings")
  private AlexaSettings alexaSettings;
  @JsonProperty("autoreply_settings")
  private AutoreplySettings autoreplySettings;
  private String mode;
}
