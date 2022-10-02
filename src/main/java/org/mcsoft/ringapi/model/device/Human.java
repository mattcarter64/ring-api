package org.mcsoft.ringapi.model.device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Human{
    public boolean enabled;
    public String mode;
    @JsonProperty("record") 
    public Object myrecord;
    public boolean notification;
}
