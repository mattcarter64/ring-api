package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class LightScheduleSettings{
    public int start_hour;
    public int start_minute;
    public int end_hour;
    public int end_minute;
}
