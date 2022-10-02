package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class FloodlightSettings{
    public int priority;
    public int duration;
    public int brightness;
    public int always_on_duration;
    public boolean always_on;
}
