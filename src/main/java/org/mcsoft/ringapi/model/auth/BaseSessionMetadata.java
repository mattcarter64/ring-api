package org.mcsoft.ringapi.model.auth;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BaseSessionMetadata {

    @JsonProperty("api_version")
    private int apiVersion = 11;
    @JsonProperty("device_model")
    private String deviceModel = "ring-client-api";
}
