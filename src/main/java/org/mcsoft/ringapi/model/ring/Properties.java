package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Properties {
  @JsonProperty("active_streaming_profile")
  private String activeStreamingProfile;
  @JsonProperty("is_sidewalk")
  private boolean isSidewalk;
}
