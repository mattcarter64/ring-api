package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChimeSettings {
  private int duration;
  private boolean enable;
  @JsonProperty("enable_ext")
  private boolean enableExt;
  private int type;
}
