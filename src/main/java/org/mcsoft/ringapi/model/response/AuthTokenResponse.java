package org.mcsoft.ringapi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class AuthTokenResponse extends ExtendedResponse {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("expires_in")
    private long expiresIn;
    @JsonProperty("refresh_token")
    private String refreshToken;
    private String scope ;
    @JsonProperty("token_type")
    private String tokenType;
}
