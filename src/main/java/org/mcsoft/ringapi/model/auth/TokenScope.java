package org.mcsoft.ringapi.model.auth;

public enum TokenScope {

    CLIENT("client");

    private final String type;

    TokenScope(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
