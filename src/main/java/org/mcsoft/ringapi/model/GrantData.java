package org.mcsoft.ringapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GrantData {
    @JsonProperty("grant_type")
    private String grantType;
    @JsonProperty("refresh_token")
    private String refreshToken;
//    private String userName;
//    private String password;

    public GrantData(String grantType, String refreshToken) {
        this.grantType = grantType;
        this.refreshToken = refreshToken;
    }

    public GrantData(String grantType) {
        this.grantType = grantType;
    }
}
