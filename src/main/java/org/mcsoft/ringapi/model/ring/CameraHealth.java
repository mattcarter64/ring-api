package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CameraHealth {
  @JsonProperty("transformer_voltage")
  private int transformerVoltage;
  @JsonProperty("transformer_voltage_category")
  private String transformerVoltageCategory;
  @JsonProperty("ext_power_state")
  private int extPowerState;
}
