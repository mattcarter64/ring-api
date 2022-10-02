package org.mcsoft.ringapi.model.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=true)
public class Doorbot extends BaseDevice {

    public boolean subscribed;
    public boolean subscribed_motions;
    public String battery_life;
    public boolean external_connection;
    public double latitude;
    public double longitude;
    public String address;
    public DoorbotSettings settings;
    public Features features;
    public boolean owned;
    public Alerts alerts;
    public Object motion_snooze;
    public boolean stolen;
    public Object ring_id;
    public Object ring_net_id;
    public boolean is_sidewalk_gateway;
    public Date created_at;
    public Object shared_at;
    public Object active_schedule_uuid;
    public Health health;
    public Object deactivated_at;
    public Owner owner;


}
