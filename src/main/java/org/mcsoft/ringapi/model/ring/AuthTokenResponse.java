package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AuthTokenResponse {
  @JsonProperty("access_token")
  private String accessToken;
  @JsonProperty("expires_in")
  private int expiresIn;
  @JsonProperty("refresh_token")
  private String refreshToken;
  private String scope;
  @JsonProperty("token_type")
  private String tokenType;
}
