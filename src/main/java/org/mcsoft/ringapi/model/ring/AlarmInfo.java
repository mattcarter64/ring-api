package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AlarmInfo {
  private String state;
  private String[] faultedDevices;
  private int timestamp;
  private String uuid;
}
