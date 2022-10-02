package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class HistoryOptions {
  private int limit;
  private int offset;
  private String category;
  private int maxLevel;
}
