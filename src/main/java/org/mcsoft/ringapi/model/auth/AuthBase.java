package org.mcsoft.ringapi.model.auth;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@ToString
public abstract class AuthBase implements Auth {
    @Getter(onMethod = @__(@Override))
    private String systemId;
}
