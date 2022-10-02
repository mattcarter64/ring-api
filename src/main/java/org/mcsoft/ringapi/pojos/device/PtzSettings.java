package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class PtzSettings{
    public Object mode;
    public PanSettings pan_settings;
    public TiltSettings tilt_settings;
    public AutoScan auto_scan;
}
