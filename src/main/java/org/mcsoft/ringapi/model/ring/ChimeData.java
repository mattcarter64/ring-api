package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChimeData {
  private int id;
  private String description;
  @JsonProperty("device_id")
  private String deviceId;
  @JsonProperty("time_zone")
  private String timeZone;
  @JsonProperty("firmware_version")
  private String firmwareVersion;
  private String kind;
  private int latitude;
  private int longitude;
  private String address;
  private Settings settings;
  private Features features;
  private boolean owned;
  private Alerts alerts;
  @JsonProperty("do_not_disturb")
  private DoNotDisturb doNotDisturb;
  private boolean stolen;
  @JsonProperty("location_id")
  private String locationId;
  @JsonProperty("ring_id")
  private String ringId;
  private Owner owner;
}
