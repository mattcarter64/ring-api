package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ChimeHealth {
  private int id;
  @JsonProperty("wifi_name")
  private String wifiName;
  @JsonProperty("battery_percentage")
  private String batteryPercentage;
  @JsonProperty("battery_percentage_category")
  private String batteryPercentageCategory;
  @JsonProperty("battery_voltage")
  private int batteryVoltage;
  @JsonProperty("battery_voltage_category")
  private String batteryVoltageCategory;
  @JsonProperty("latest_signal_strength")
  private int latestSignalStrength;
  @JsonProperty("latest_signal_category")
  private String latestSignalCategory;
  @JsonProperty("average_signal_strength")
  private int averageSignalStrength;
  @JsonProperty("average_signal_category")
  private String averageSignalCategory;
  private String firmware;
  @JsonProperty("updated_at")
  private String updatedAt;
  @JsonProperty("wifi_is_ring_network")
  private boolean wifiIsRingNetwork;
  @JsonProperty("packet_loss_category")
  private String packetLossCategory;
  @JsonProperty("packet_loss_strength")
  private int packetLossStrength;
}
