package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RingtoneOptions {
  @JsonProperty("default_ding_user_id")
  private String defaultDingUserId;
  @JsonProperty("default_ding_id")
  private String defaultDingId;
  @JsonProperty("default_motion_user_id")
  private String defaultMotionUserId;
  @JsonProperty("default_motion_id")
  private String defaultMotionId;
  private Audios audios;
}
