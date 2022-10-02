package org.mcsoft.ringapi.pojos.device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class Motion{
    public boolean enabled;
    public String mode;
    @JsonProperty("record") 
    public Object myrecord;
    public boolean notification;
    public String id;
    public String name;
    public String state;
    public Properties properties;
    public List<Vertex> vertices;
}
