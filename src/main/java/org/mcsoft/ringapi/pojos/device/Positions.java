package org.mcsoft.ringapi.pojos.device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Positions{
    @JsonProperty("default") 
    public Object mydefault;
    public Object min;
    public Object max;
}
