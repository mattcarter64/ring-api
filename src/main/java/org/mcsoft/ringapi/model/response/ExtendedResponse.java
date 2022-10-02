package org.mcsoft.ringapi.model.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public abstract class ExtendedResponse {
    private long responseTimestamp;
    private long timeMillis;
}
