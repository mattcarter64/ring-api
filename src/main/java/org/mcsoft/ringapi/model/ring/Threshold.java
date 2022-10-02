package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Threshold {
  private int loitering;
  @JsonProperty("package_delivery")
  private int packageDelivery;
}
