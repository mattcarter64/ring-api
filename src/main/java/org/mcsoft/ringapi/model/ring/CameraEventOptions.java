package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CameraEventOptions {
  private int limit;
  private String kind;
  private String state;
  private boolean favorites;
  private String olderThanId;
  @JsonProperty("pagination_key")
  private String paginationKey;
}
