package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserLocation {
  private String address;
  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("geo_coordinates")
  private String geoCoordinates;
  @JsonProperty("geo_service_verified")
  private String geoServiceVerified;
  @JsonProperty("location_id")
  private String locationId;
  private String name;
  @JsonProperty("owner_id")
  private int ownerId;
  @JsonProperty("updated_at")
  private String updatedAt;
  @JsonProperty("user_verified")
  private boolean userVerified;
}
