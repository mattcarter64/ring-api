package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CameraEvent {
  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("cv_properties")
  private CvProperties cvProperties;
  @JsonProperty("ding_id")
  private int dingId;
  @JsonProperty("ding_id_str")
  private String dingIdStr;
  @JsonProperty("doorbot_id")
  private int doorbotId;
  private boolean favorite;
  private String kind;
  private boolean recorded;
  @JsonProperty("recording_status")
  private String recordingStatus;
  private String state;
}
