package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class DetectionTypes {
  private String human;
  private String loitering;
  private String motion;
  @JsonProperty("moving_vehicle")
  private String movingVehicle;
  @JsonProperty("nearby_pom")
  private String nearbyPom;
  @JsonProperty("other_motion")
  private String otherMotion;
  @JsonProperty("package_delivery")
  private String packageDelivery;
  @JsonProperty("package_pickup")
  private String packagePickup;
}
