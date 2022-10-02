package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VideoSettings {
  @JsonProperty("exposure_control")
  private int exposureControl;
  @JsonProperty("night_color_enable")
  private boolean nightColorEnable;
  @JsonProperty("hdr_enable")
  private boolean hdrEnable;
  @JsonProperty("clip_length_max")
  private int clipLengthMax;
  @JsonProperty("clip_length_min")
  private int clipLengthMin;
  @JsonProperty("ae_mode")
  private int aeMode;
  @JsonProperty("ae_mask")
  private String aeMask;
}
