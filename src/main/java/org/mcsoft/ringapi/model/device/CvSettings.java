package org.mcsoft.ringapi.model.device;
import lombok.Data;

import java.util.List;
@Data
public class CvSettings{
    public DetectionTypes detection_types;
    public Threshold threshold;
    public List<Object> triggers;
}
