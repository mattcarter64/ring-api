package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChimeUpdate {
  private String description;
  private int latitude;
  private int longitude;
  private String address;
  private Settings settings;
}
