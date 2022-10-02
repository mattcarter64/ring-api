package org.mcsoft.ringapi.service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.mcsoft.ringapi.MethodType;
import org.mcsoft.ringapi.RequestOptions;
import org.mcsoft.ringapi.RingRestClient;
import org.mcsoft.ringapi.model.GrantData;
import org.mcsoft.ringapi.model.auth.*;
import org.mcsoft.ringapi.model.response.AuthTokenResponse;
import org.mcsoft.ringapi.model.response.SessionResponse;
import org.mcsoft.ringapi.util.ThreadManager;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Data
public class AuthService {

    private static final String OAUTH_TOKEN_URI = "https://oauth.ring.com/oauth/token";

    private final Auth authOptions;
    private final RingRestClient restClient;
    private GrantData grantData;
    private String refreshToken;
    private AuthTokenResponse authTokenResponse;
    private SessionResponse sessionResponse;
    private ScheduledFuture<?> refreshAUthTokenTask;

    public AuthService(Auth authOptions, RingRestClient restClient) {
        this.authOptions = authOptions;
        this.restClient = restClient;
    }

    public void start() throws Exception {

        log.info("starting AUTH service...");

        refreshToken = ((RefreshTokenAuth) authOptions).getRefreshToken();

        log.info("refresh token={}", refreshToken);

        authTokenResponse = getAuth(null);

        log.info("auth token response={}", authTokenResponse);

        sessionResponse = getSession();

        refreshAUthTokenTask = ThreadManager.scheduleFixedDelayTask(new RefreshAuthTokenTask(), 0, 59, TimeUnit.MINUTES);
    }

    public void stop() {
    }

    @Data
    private class AuthRequestPayload {
        @JsonProperty("client_id")
        private String clientId = "";
        private String scope = TokenScope.CLIENT.getType();
        @JsonProperty("grant_type")
        private String grantType;
        @JsonProperty("refresh_token")
        private String refreshToken;

        public AuthRequestPayload(GrantData grantData) {
            this.grantType = grantData.getGrantType();
            this.refreshToken = grantData.getRefreshToken();
        }
    }

    public AuthTokenResponse getAuth(String twoFactorAuthCode) throws Exception {

        log.info("get auth. auth code={}", twoFactorAuthCode);

        grantData = getGrantData(twoFactorAuthCode);

        AuthRequestPayload payload = new AuthRequestPayload(grantData);

        Map<String, String> headers = new HashMap<>();

        headers.put("2fa-support", "true");
        headers.put("2fa-code", twoFactorAuthCode != null ? twoFactorAuthCode : "");

        RequestOptions options = new RequestOptions()
                .setUri(OAUTH_TOKEN_URI)
                .setMethod(MethodType.POST)
                .setHeaders(headers)
                .setJson(objectMapper.writeValueAsString(payload));

        return restClient.request(options, AuthTokenResponse.class);
    }

    private GrantData getGrantData(String twoFactorAuthCode) throws Exception {

        if (refreshToken != null && twoFactorAuthCode == null) {
            return new GrantData("refresh_token", refreshToken);
        }

        if (this.authOptions instanceof EmailAuth) {
            GrantData ret = new GrantData("password");

//            ret.setUserName(((EmailAuth) authOptions).getUserName());
//            ret.setPassword(((EmailAuth) authOptions).getPassword());

            return ret;
        }

        throw new Exception("Refresh token is not valid.  Unable to authenticate with Ring servers.");
    }

    public SessionResponse getSession() throws IOException {

        log.info("get session...");

        return fetchNewSession(authTokenResponse);
    }

    @Data
    private class AuthDevice {

        @JsonProperty("hardware_id")
        private UUID hardwareId;
        private BaseSessionMetadata metadata;
        private String os = "android";
    }

    @Data
    private class SessionDevice {
        private AuthDevice device;
    }

    ObjectMapper objectMapper = new ObjectMapper();

    private SessionResponse fetchNewSession(AuthTokenResponse authTokenResponse) throws IOException {

        log.info("fetch new session");

        SessionDevice sessionDevice = new SessionDevice();

        AuthDevice authDevice = new AuthDevice();

        authDevice.setHardwareId(restClient.getHardwareId());
        authDevice.setMetadata(new BaseSessionMetadata());

        sessionDevice.setDevice(authDevice);

        RequestOptions requestOptions = new RequestOptions()
                .setUri(restClient.clientApi("session"))
                .setJson(objectMapper.writeValueAsString(sessionDevice))
                .setMethod(MethodType.POST);

        return restClient.request(requestOptions, SessionResponse.class);
    }

    private static class RefreshAuthTokenTask implements Runnable {

        @Override
        public void run() {

        }
    }
}
