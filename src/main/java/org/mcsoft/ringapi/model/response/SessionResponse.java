package org.mcsoft.ringapi.model.response;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.mcsoft.ringapi.model.Profile;

@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class SessionResponse extends ExtendedResponse {

    private Profile profile;
}
