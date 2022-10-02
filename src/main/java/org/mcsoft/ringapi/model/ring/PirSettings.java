package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PirSettings {
  @JsonProperty("sensitivity_1")
  private int sensitivity1;
  @JsonProperty("sensitivity_2")
  private int sensitivity2;
  @JsonProperty("sensitivity_3")
  private int sensitivity3;
  @JsonProperty("zone_enable")
  private int zoneEnable;
}
