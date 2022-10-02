package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class RingDeviceData {
  private String zid;
  private String name;
  private String deviceType;
  private int categoryId;
  private int batteryLevel;
  private String batteryStatus;
  private String batteryBackup;
  private String acStatus;
  private String manufacturerName;
  private String serialNumber;
  private String tamperStatus;
  private boolean faulted;
  private String locked;
  private int roomId;
  private int volume;
  private String mode;
  private int transitionDelayEndTimestamp;
  private AlarmInfo alarmInfo;
  private String siren;    // : { state: 'on' | 'off' }
  private String alarmStatus;
  private String co;
  private String smoke;
  private boolean flood;
  private boolean freeze;
  private String motionStatus;
  private String groupId;
  private String[] tags;
    // switch
  private boolean on;
    // switch.multilevel
  private int level;
  private Hs hs;
  private int ct;
    // Retrofit sensor.zone
  private String status;
  private String parentZid;
  private String rootDevice;
  private String relToParentZid;
    //sensor.temperature
  private int celsius;
  private int faultHigh;
  private int faultLow;
    // temperature-control.thermostat
    // Related: 'mode?: ThermostatMode' (above)
  private int setPoint;
  private int setPointMax;
  private int setPointMin;
  private int basicValue;
  private ComponentDevices componentDevices;
    // switch.multilevel.beam
  private boolean motionSensorEnabled;
    // security-keypad
  private int brightness;
}
