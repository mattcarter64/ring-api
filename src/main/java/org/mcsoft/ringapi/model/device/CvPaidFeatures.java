package org.mcsoft.ringapi.model.device;

import lombok.Data;

@Data
public class CvPaidFeatures{
    public boolean baby_cry;
    public boolean car_alarm;
    public boolean co2_smoke_alarm;
    public boolean dog_bark;
    public boolean general_sound;
    public boolean glass_break;
    public boolean human;
    public boolean loitering;
    public boolean motion;
    public boolean other_motion;
    public boolean package_delivery;
    public boolean package_pickup;
    public boolean cv_triggers;
}
