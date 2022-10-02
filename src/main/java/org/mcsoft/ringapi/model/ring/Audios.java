package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Audios {
  @JsonProperty("user_id")
  private String userId;
  private String id;
  private String description;
  private String kind;
  private String url;
  private String checksum;
  private String available;
}
