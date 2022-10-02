package org.mcsoft.ringapi.model.auth;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class RefreshTokenAuth extends AuthBase {
    public String refreshToken;

    public RefreshTokenAuth(String refreshToken) {
        this.refreshToken = refreshToken;
    }

}
