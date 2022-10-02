package org.mcsoft.ringapi.pojos.device;

import lombok.Data;

@Data
public class Movement{
    public Object max_speed;
    public Object max_acceleration;
    public Object step_size;
}
