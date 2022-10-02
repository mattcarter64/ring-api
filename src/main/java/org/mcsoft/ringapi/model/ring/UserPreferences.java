package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserPreferences {
  private Object settings;
  private Object preferences;
}
