package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ServerSettings {
  @JsonProperty("ring_media_server_enabled")
  private boolean ringMediaServerEnabled;
}
