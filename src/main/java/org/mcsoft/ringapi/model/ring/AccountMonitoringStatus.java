package org.mcsoft.ringapi.model.ring;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AccountMonitoringStatus {
  private String accountUuid;
  private String externalServiceConfigType;
  private String accountState;
  private boolean eligibleForDispatch;
  private boolean addressComplete;
  private boolean contactsComplete;
  private boolean codewordComplete;
  private boolean alarmSignalSent;
  private boolean professionallyMonitored;
  private boolean userAcceptDispatch;
  private int installationDate;
  private String externalId;
  private boolean vrRequired;
  private boolean vrUserOptIn;
  private String cmsMonitoringType;
  private boolean dispatchSetupComplete;
}
