package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class PirSettings{
    public int sensitivity1;
    public int sensitivity2;
    public int sensitivity3;
    public int zone_mask;
}
