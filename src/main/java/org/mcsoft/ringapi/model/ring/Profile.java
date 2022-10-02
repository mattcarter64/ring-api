package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Profile {
  private int id;
  private String email;
  @JsonProperty("first_name")
  private String firstName;
  @JsonProperty("last_name")
  private String lastName;
  @JsonProperty("phone_number")
  private String phoneNumber;
  @JsonProperty("authentication_token")
  private String authenticationToken;
  private String[] features;
  @JsonProperty("user_preferences")
  private UserPreferences userPreferences;
  @JsonProperty("hardware_id")
  private String hardwareId;
  @JsonProperty("explorer_program_terms")
  private String explorerProgramTerms;
  @JsonProperty("user_flow")
  private String userFlow;
  @JsonProperty("app_brand")
  private String appBrand;
  private String country;
  private String status;
  @JsonProperty("created_at")
  private String createdAt;
  @JsonProperty("tfa_enabled")
  private boolean tfaEnabled;
  @JsonProperty("tfa_phone_number")
  private String tfaPhoneNumber;
  @JsonProperty("account_type")
  private String accountType;
}
