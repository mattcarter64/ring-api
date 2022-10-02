package org.mcsoft.ringapi.model.device;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper=true)
public class StickupCam extends BaseDevice {

    public boolean subscribed;
    public boolean subscribed_motions;
    public int battery_life;
    public boolean external_connection;
    public double latitude;
    public double longitude;
    public String address;
    public StickupCameraSettings settings;
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
    public boolean camera_location_indoor;
    public Object facing_window;
    public SirenStatus siren_status;
    public int ext_power_state;
    public String led_status;
    public String night_mode_status;
    public String ring_cam_light_installed;
    public String ring_cam_setup_flow;
}
