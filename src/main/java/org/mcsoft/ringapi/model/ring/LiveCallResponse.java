package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class LiveCallResponse {
  @JsonProperty("ding_id")
  private String dingId;
  @JsonProperty("ding_kind")
  private String dingKind;
  @JsonProperty("device_id")
  private int deviceId;
  @JsonProperty("device_kind")
  private String deviceKind;
  @JsonProperty("device_description")
  private String deviceDescription;
  private String state;
  private String protocol;
  private int now;
  @JsonProperty("video_jitter_buffer_ms")
  private int videoJitterBufferMs;
  @JsonProperty("audio_jitter_buffer_ms")
  private int audioJitterBufferMs;
  private Data data;
}
