package org.mcsoft.ringapi.model.device.ring;

public enum RingKind {

    doorbell("doorbell"),
    doorbell_v3("doorbell_v3"),
    doorbell_v4("doorbell_v4"),
    doorbell_v5("doorbell_v5"),
    doorbell_portal("doorbell_portal"),
    doorbell_scallop("doorbell_scallop"),
    doorbell_scallop_lite("doorbell_scallop_lite"),
    doorbell_graham_cracker("doorbell_graham_cracker"),
    lpd_v1("lpd_v1"),
    lpd_v2("lpd_v2"),
    lpd_v4("lpd_v4"),
    jbox_v1("jbox_v1"),
    stickup_cam("stickup_cam"),
    stickup_cam_v3("stickup_cam_v3"),
    stickup_cam_elite("stickup_cam_elite"),
    stickup_cam_lunar("stickup_cam_lunar"),
    spotlightw_v2("spotlightw_v2"),
    hp_cam_v1("hp_cam_v1"),
    hp_cam_v2("hp_cam_v2"),
    stickup_cam_v4("stickup_cam_v4"),
    floodlight_v1("floodlight_v1"),
    floodlight_v2("floodlight_v2"),
    floodlight_pro("floodlight_pro"),
    cocoa_camera("cocoa_camera"), // appears to be used for all next gen stickup cams (wired/battery/solar)
    cocoa_doorbell("cocoa_doorbell"),
    cocoa_floodlight("cocoa_floodlight"),
    stickup_cam_mini("stickup_cam_mini"),
    chime("chime"),
    chime_pro("chime_pro"),
    chime_v2("chime_v2"),
    chime_pro_v2("chime_pro_v2"),
    UNKNOWN("Unknown");

    private final String kind;

    RingKind(String kind) {
        this.kind = kind;
    }

//    public static RingCameraKind valueOf(String kind) {
//        for (RingCameraKind value : values()) {
//            if (kind.equalsIgnoreCase(value.kind)) {
//                return value;
//            }
//        }
//
//        return UNKNOWN;
//    }

}
