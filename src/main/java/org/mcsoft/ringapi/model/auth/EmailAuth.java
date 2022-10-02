package org.mcsoft.ringapi.model.auth;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class EmailAuth extends AuthBase {
    private String userName;
    private String password;
}
