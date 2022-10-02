package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CameraData {
  private int id;
  private String description;
  @JsonProperty("device_id")
  private String deviceId;
  @JsonProperty("time_zone")
  private String timeZone;
  private boolean subscribed;
  @JsonProperty("subscribed_motions")
  private boolean subscribedMotions;
  @JsonProperty("battery_life")
  private String batteryLife;
  @JsonProperty("battery_life_2")
  private String batteryLife2;
  @JsonProperty("battery_voltage")
  private int batteryVoltage;
  @JsonProperty("battery_voltage_2")
  private int batteryVoltage2;
  @JsonProperty("external_connection")
  private boolean externalConnection;
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
  @JsonProperty("motion_snooze")
  private MotionSnooze motionSnooze;
  private boolean stolen;
  @JsonProperty("location_id")
  private String locationId;
  @JsonProperty("ring_id")
  private String ringId;
  @JsonProperty("motion_detection_enabled")
  private boolean motionDetectionEnabled;
  @JsonProperty("camera_location_indoor")
  private boolean cameraLocationIndoor;
  @JsonProperty("facing_window")
  private boolean facingWindow;
  @JsonProperty("enable_ir_led")
  private boolean enableIrLed;
  private Owner owner;
  @JsonProperty("led_status")
  private String ledStatus;
  @JsonProperty("night_mode_status")
  private String nightModeStatus;    // 'true' | 'false'
  @JsonProperty("ring_cam_light_installed")
  private String ringCamLightInstalled;    // 'true' | 'false'
  @JsonProperty("ring_cam_setup_flow")
  private String ringCamSetupFlow;
  @JsonProperty("siren_status")
  private SirenStatus sirenStatus;
  private Health health;
}
