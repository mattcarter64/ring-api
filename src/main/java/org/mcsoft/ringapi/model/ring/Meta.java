package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Meta {
  @JsonProperty("pagination_key")
  private int paginationKey;
  @JsonProperty("butch_size")
  private int butchSize;
}
