package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TicketAsset {
  private int doorbotId;
  private String kind;
  private boolean onBattery;
  private String status;
  private String uuid;
}
