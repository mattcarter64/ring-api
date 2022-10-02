package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LocationModeSharing {
  private boolean sharedUsersEnabled;
  private int lastUpdateTimeMS;
}
