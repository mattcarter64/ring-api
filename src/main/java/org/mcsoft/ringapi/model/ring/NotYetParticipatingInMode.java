package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NotYetParticipatingInMode {
  private int deviceId;
  private String deviceIdType;
}
