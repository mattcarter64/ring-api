package org.mcsoft.ringapi.model.device;

import lombok.Data;

@Data
public class DetectionTypes{
    public Human human;
    public Loitering loitering;
    public Motion motion;
    public MovingVehicle moving_vehicle;
    public OtherMotion other_motion;
    public PackageDelivery package_delivery;
    public PackagePickup package_pickup;
    public BabyCry baby_cry;
    public CarAlarm car_alarm;
    public Co2SmokeAlarm co2_smoke_alarm;
    public DogBark dog_bark;
    public GeneralSound general_sound;
    public GlassBreak glass_break;
}
