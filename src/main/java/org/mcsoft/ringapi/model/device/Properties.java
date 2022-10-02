package org.mcsoft.ringapi.model.device;
import lombok.Data;

import java.util.List;
@Data
public class Properties{
    public List<String> detection_types;
    public int style;
}
