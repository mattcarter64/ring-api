package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Health {
  @JsonProperty("device_type")
  private String deviceType;
  @JsonProperty("last_update_time")
  private int lastUpdateTime;
  private boolean connected;
  @JsonProperty("rss_connected")
  private boolean rssConnected;
  @JsonProperty("vod_enabled")
  private boolean vodEnabled;
  @JsonProperty("sidewalk_connection")
  private boolean sidewalkConnection;
  @JsonProperty("floodlight_on")
  private boolean floodlightOn;
  @JsonProperty("siren_on")
  private boolean sirenOn;
  @JsonProperty("white_led_on")
  private boolean whiteLedOn;
  @JsonProperty("night_mode_on")
  private boolean nightModeOn;
  @JsonProperty("hatch_open")
  private boolean hatchOpen;
  @JsonProperty("packet_loss")
  private int packetLoss;
  @JsonProperty("packet_loss_category")
  private String packetLossCategory;
  private int rssi;
  @JsonProperty("battery_voltage")
  private int batteryVoltage;
  @JsonProperty("wifi_is_ring_network")
  private boolean wifiIsRingNetwork;
  @JsonProperty("supported_rpc_commands")
  private String[] supportedRpcCommands;
  @JsonProperty("ota_status")
  private String otaStatus;
  @JsonProperty("ext_power_state")
  private int extPowerState;
  @JsonProperty("pref_run_mode")
  private String prefRunMode;
  @JsonProperty("run_mode")
  private String runMode;
  @JsonProperty("network_connection_value")
  private String networkConnectionValue;
  @JsonProperty("ac_power")
  private int acPower;
  @JsonProperty("battery_present")
  private boolean batteryPresent;
  @JsonProperty("external_connection")
  private boolean externalConnection;
  @JsonProperty("battery_percentage")
  private int batteryPercentage;
  @JsonProperty("battery_percentage_category")
  private String batteryPercentageCategory;
  @JsonProperty("firmware_version")
  private String firmwareVersion;
  @JsonProperty("rssi_category")
  private String rssiCategory;
  @JsonProperty("battery_voltage_category")
  private String batteryVoltageCategory;
  @JsonProperty("second_battery_voltage_category")
  private String secondBatteryVoltageCategory;
  @JsonProperty("second_battery_percentage_category")
  private String secondBatteryPercentageCategory;
  @JsonProperty("battery_save")
  private boolean batterySave;
  @JsonProperty("firmware_version_status")
  private String firmwareVersionStatus;
  @JsonProperty("tx_rate")
  private int txRate;
  @JsonProperty("ptz_connected")
  private String ptzConnected;
}
