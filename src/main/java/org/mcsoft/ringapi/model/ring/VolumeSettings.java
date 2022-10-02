package org.mcsoft.ringapi.model.ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class VolumeSettings {
  @JsonProperty("doorbell_volume")
  private int doorbellVolume;
  @JsonProperty("mic_volume")
  private int micVolume;
  @JsonProperty("voice_volume")
  private int voiceVolume;
}
