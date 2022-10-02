package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AssetSession {
  private String assetUuid;
  private String connectionStatus;
  private int doorbotId;
  private String kind;
  private int sessionId;
}
