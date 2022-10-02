package org.mcsoft.ringapi.model;

import lombok.Data;

@Data
public class UserPreferences {
    private Settings settings;
    private RingPreferences preferences;
}
