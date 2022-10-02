package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class SheilaSettings {
  @JsonProperty("cv_processing_enabled")
  private boolean cvProcessingEnabled;
  @JsonProperty("local_storage_enabled")
  private boolean localStorageEnabled;
}
