package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VideoSearchResult {
  @JsonProperty("ding_id")
  private String dingId;
  @JsonProperty("created_at")
  private int createdAt;
  @JsonProperty("hq_url")
  private String hqUrl;
  @JsonProperty("lq_url")
  private String lqUrl;
  @JsonProperty("preroll_duration")
  private String prerollDuration;
  @JsonProperty("thumbnail_url")
  private String thumbnailUrl;
  @JsonProperty("untranscoded_url")
  private String untranscodedUrl;
  private String kind;
  private String state;
  @JsonProperty("had_subscription")
  private boolean hadSubscription;
  private boolean favorite;
  private int duration;
  @JsonProperty("cv_properties")
  private CvProperties cvProperties;
}
