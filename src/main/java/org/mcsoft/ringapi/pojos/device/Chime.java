package org.mcsoft.ringapi.pojos.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=true)
public class Chime extends BaseDevice {

    public double latitude;
    public double longitude;
    public String address;
    public ChimeSettings settings;
    public Features features;
    public boolean owned;
    public Alerts alerts;
    public DoNotDisturb do_not_disturb;
    public boolean stolen;
    public String location_id;
    public Object ring_id;
    public Object ring_net_id;
    public boolean is_sidewalk_gateway;
    public Date created_at;
    public Object shared_at;
    public Owner owner;
    public Object deactivated_at;
}
