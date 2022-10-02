package org.mcsoft.ringapi.pojos.device;
import lombok.Data;

import java.util.List;
@Data
public class Root{
    public List<Doorbot> doorbots;
    public List<Object> authorized_doorbots;
    public List<Chime> chimes;
    public List<StickupCam> stickup_cams;
    public List<Object> base_stations;
    public List<Object> beams_bridges;
    public List<Object> beams;
    public List<Object> other;
}
