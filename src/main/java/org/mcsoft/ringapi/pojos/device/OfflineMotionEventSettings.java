package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class OfflineMotionEventSettings{
    public boolean subscribed;
    public boolean enabled;
    public int max_upload_kb;
    public int resolution_p;
    public int frequency_after_secs;
    public int period_after_secs;
}
