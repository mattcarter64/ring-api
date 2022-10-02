package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class ChimeSettings {
    public int volume;
    public String ding_audio_user_id;
    public String ding_audio_id;
    public String motion_audio_user_id;
    public String motion_audio_id;
    public boolean status_led_enable;
}
