package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SocketIoMessage {
  private String msg;
  private String datatype;
  private String src;
  private Object body;
}
