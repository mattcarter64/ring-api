package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BeamBridge {
  @JsonProperty("created_at")
  private String createdAt;
  private String description;
  @JsonProperty("hardware_id")
  private String hardwareId;
  private int id;
  private String kind;
  @JsonProperty("location_id")
  private String locationId;
  private boolean metadata;
  @JsonProperty("owner_id")
  private int ownerId;
  private String role;
  @JsonProperty("updated_at")
  private String updatedAt;
}
