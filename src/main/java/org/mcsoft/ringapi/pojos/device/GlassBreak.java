package org.mcsoft.ringapi.pojos.device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GlassBreak{
    public boolean enabled;
    public String mode;
    @JsonProperty("record") 
    public Object myrecord;
    public boolean notification;
}
