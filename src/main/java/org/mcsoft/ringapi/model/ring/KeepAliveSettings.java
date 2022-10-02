package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class KeepAliveSettings {
  @JsonProperty("keep_alive_auto")
  private int keepAliveAuto;
}
