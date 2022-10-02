package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LocationModeSettings {
  private String disarmed;
  private String home;
  private String away;
}
