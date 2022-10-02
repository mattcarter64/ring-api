package org.mcsoft.ringapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
    private String address1;
    private String address2;
    @JsonProperty("cross_street")
    private String crossStreet;
    private String city;
    private String state;
    private String timezone;
    @JsonProperty("zip_code")
    private String zipCode;
    private String country;
}
