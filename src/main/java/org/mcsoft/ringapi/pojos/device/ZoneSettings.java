package org.mcsoft.ringapi.pojos.device;
import lombok.Data;

import java.util.List;
@Data
public class ZoneSettings{
    public List<Motion> motion;
    public List<Aerial> aerial;
}
