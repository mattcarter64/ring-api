package org.mcsoft.ringapi;

public enum RingErrorCodes {

    NO_ASSET(7050),
    ASSET_OFFLINE(7019),
    ASSET_CELL_BACKUP(7061),
    UPDATING(7062),
    MAINTENANCE(7063),
    UNKNOWN(-1);

    private final int code;

    RingErrorCodes(int code) {
        this.code = code;
    }

    public static RingErrorCodes valueOf(int code) {
        for (RingErrorCodes value : values()) {
            if (value.code == code) {
                return value;
            }
        }

        return UNKNOWN;
    }

    public int getCode() {
        return this.code;
    }
}
