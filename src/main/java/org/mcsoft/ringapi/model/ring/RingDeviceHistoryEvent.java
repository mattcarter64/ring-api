package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RingDeviceHistoryEvent {
  private String msg;
  private String datatype;
  private Object body;
}
