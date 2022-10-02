package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class RadarSettings{
    public boolean birds_eye_view_enabled;
    public boolean bez_filtering_enabled;
    public boolean bez_feature_enabled;
    public double installation_height;
}
