package org.mcsoft.ringapi.model.device;
import lombok.Data;

import java.util.List;
@Data
public class ZoneSettings{
    public List<Motion> motion;
    public List<Aerial> aerial;
}
