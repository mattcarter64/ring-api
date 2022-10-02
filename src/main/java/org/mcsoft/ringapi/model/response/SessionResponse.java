package org.mcsoft.ringapi.model.response;

import lombok.Data;
import lombok.ToString;
import org.mcsoft.ringapi.model.Profile;

@Data
@ToString
public class SessionResponse extends ExtendedResponse {

    private Profile profile;
}
