package org.mcsoft.ringapi.model.device;

import lombok.Data;

@Data
public class Alerts{
    public String connection;
    public String ota_status;
    public boolean sidewalk_connection;
    public String rssi;
}
