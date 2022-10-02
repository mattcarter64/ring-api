package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CameraEventResponse {
  private String events;
  private String meta;
}
