package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BaseStation {
  private String address;
  private Object alerts;
  private String description;
  @JsonProperty("device_id")
  private String deviceId;
  private String features;
  @JsonProperty("firmware_version")
  private String firmwareVersion;
  private int id;
  private String kind;
  private int latitude;
  @JsonProperty("location_id")
  private String locationId;
  private int longitude;
  private boolean owned;
  private Owner owner;
  @JsonProperty("ring_id")
  private String ringId;
  private String settings;
  private boolean stolen;
  @JsonProperty("time_zone")
  private String timeZone;
}
