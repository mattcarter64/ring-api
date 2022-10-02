package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PeriodicalFootage {
  @JsonProperty("start_ms")
  private int startMs;
  @JsonProperty("end_ms")
  private int endMs;
  @JsonProperty("playback_ms")
  private int playbackMs;
  private String kind;
  private String url;
  private boolean deleted;
  private int snapshots;
}
