package org.mcsoft.ringapi.model.auth;

public enum TokenType {

    BEARER("Bearer");

    private final String type;

    TokenType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
