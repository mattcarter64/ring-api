package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PeriodicFootageResponse {
  private Meta meta;
  private String data;
  private int responseTimestamp;
}
