package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CameraDeviceSettingsData {
  @JsonProperty("advanced_motion_settings")
  private AdvancedMotionSettings advancedMotionSettings;
  @JsonProperty("chime_settings")
  private ChimeSettings chimeSettings;
  @JsonProperty("motion_settings")
  private MotionSettings motionSettings;
  @JsonProperty("video_settings")
  private VideoSettings videoSettings;
  @JsonProperty("vod_settings")
  private VodSettings vodSettings;
  @JsonProperty("volume_settings")
  private VolumeSettings volumeSettings;
  @JsonProperty("cv_settings")
  private CvSettings cvSettings;
  @JsonProperty("general_settings")
  private GeneralSettings generalSettings;
  @JsonProperty("keep_alive_settings")
  private KeepAliveSettings keepAliveSettings;
  @JsonProperty("pir_settings")
  private PirSettings pirSettings;
  @JsonProperty("snapshot_settings")
  private SnapshotSettings snapshotSettings;
  @JsonProperty("client_device_settings")
  private ClientDeviceSettings clientDeviceSettings;
  @JsonProperty("concierge_settings")
  private ConciergeSettings conciergeSettings;
}
