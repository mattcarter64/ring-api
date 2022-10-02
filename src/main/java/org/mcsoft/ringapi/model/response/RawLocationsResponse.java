package org.mcsoft.ringapi.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.mcsoft.ringapi.model.UserLocation;

import java.util.List;

@Data
@ToString
@EqualsAndHashCode(callSuper=true)
public class RawLocationsResponse extends ExtendedResponse {
    @JsonProperty("user_locations")
    private List<UserLocation> userLocations;
}
