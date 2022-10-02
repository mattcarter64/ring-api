package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SnapshotSettings {
  @JsonProperty("frequency_secs")
  private int frequencySecs;
  @JsonProperty("lite_24x7_resolution_p")
  private int lite24x7ResolutionP;
  @JsonProperty("ome_resolution_p")
  private int omeResolutionP;
  @JsonProperty("max_upload_kb")
  private int maxUploadKb;
  @JsonProperty("frequency_after_secs")
  private int frequencyAfterSecs;
  @JsonProperty("period_after_secs")
  private int periodAfterSecs;
  @JsonProperty("close_container")
  private int closeContainer;
}
