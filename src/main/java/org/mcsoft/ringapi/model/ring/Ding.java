package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Ding {
  @JsonProperty("streaming_protocol")
  private String streamingProtocol;
  @JsonProperty("location_id")
  private String locationId;
  @JsonProperty("device_name")
  private String deviceName;
  @JsonProperty("doorbot_id")
  private int doorbotId;
  @JsonProperty("e2ee_enabled")
  private boolean e2eeEnabled;
  @JsonProperty("streaming_data_hash")
  private String streamingDataHash;
  @JsonProperty("device_kind")
  private String deviceKind;
  @JsonProperty("detection_type")
  private String detectionType;
  @JsonProperty("human_detected")
  private boolean humanDetected;
  private int id;
  @JsonProperty("pod_id")
  private int podId;
  @JsonProperty("request_id")
  private String requestId;
  @JsonProperty("image_uuid")
  private String imageUuid;
  private Properties properties;
}
