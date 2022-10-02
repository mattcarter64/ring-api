package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CvDetectionType {
  private boolean enabled;
  private String mode;
  private boolean notification;
}
