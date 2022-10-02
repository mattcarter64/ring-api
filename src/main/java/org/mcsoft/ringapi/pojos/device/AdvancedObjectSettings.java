package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class AdvancedObjectSettings{
    public HumanDetectionConfidence human_detection_confidence;
    public MotionZoneOverlap motion_zone_overlap;
    public ObjectTimeOverlap object_time_overlap;
    public ObjectSizeMinimum object_size_minimum;
    public ObjectSizeMaximum object_size_maximum;
}
