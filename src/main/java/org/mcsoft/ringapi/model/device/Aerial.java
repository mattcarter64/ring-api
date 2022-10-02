package org.mcsoft.ringapi.model.device;
import lombok.Data;

import java.util.List;
@Data
public class Aerial{
    public String id;
    public String name;
    public String state;
    public Properties properties;
    public List<Vertex> vertices;
}
