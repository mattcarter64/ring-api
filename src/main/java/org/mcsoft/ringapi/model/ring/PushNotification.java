package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PushNotification {
  private Ding ding;
  private Aps aps;
  private String subtype;
  private String action;
}
