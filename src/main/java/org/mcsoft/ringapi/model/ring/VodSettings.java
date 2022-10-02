package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VodSettings {
  private boolean enable;
  @JsonProperty("toggled_at")
  private String toggledAt;
  @JsonProperty("use_cached_vod_domain")
  private boolean useCachedVodDomain;
}
