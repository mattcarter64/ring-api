package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LocationModeSetting {
  private String deviceId;
  private String deviceIdType;
  private String actions;
}
