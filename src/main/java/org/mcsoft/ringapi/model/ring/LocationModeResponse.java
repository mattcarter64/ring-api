package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LocationModeResponse {
  private String mode;
  private int lastUpdateTimeMS;
  private SecurityStatus securityStatus;
  private boolean readOnly;
  private NotYetParticipatingInMode notYetParticipatingInMode;
}
