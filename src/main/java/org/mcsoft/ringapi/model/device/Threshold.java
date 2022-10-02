package org.mcsoft.ringapi.model.device;

import lombok.Data;

@Data
public class Threshold{
    public double loitering;
    public double package_delivery;
    public double baby_cry;
    public double car_alarm;
    public double co2_smoke_alarm;
    public double dog_bark;
    public double general_sound;
    public double glass_break;
}
