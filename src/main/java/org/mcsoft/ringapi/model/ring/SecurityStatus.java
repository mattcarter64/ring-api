package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SecurityStatus {
  private int lu;
  private String md;
  private String returnTopic;
}
