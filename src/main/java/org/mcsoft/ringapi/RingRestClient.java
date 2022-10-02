package org.mcsoft.ringapi;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.classic.methods.HttpUriRequestBase;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.message.BasicHeader;
import org.mcsoft.ringapi.model.auth.Auth;
import org.mcsoft.ringapi.model.response.ExtendedResponse;
import org.mcsoft.ringapi.service.AuthService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Slf4j
public class RingRestClient {

    private static final String ringApiHost = "api.ring.com";
    private static final String clientApiBaseUrl = "/clients_api/";
    private static final String deviceApiBaseUrl = "/devices/v1/";
    private static final String appApiBaseUrl = "/api/v1/";
    private static final int apiVersion = 11;

    private AuthService authService;
    private String authToken;
    private UUID hardwareId;
    private Auth authOptions;

    private CloseableHttpAsyncClient client = null;

    private final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public String clientApi(String path) {
        return clientApiBaseUrl + path;
    }

    public String deviceApi(String path) {
        return deviceApiBaseUrl + path;
    }

    public String appApi(String path) {
        return appApiBaseUrl + path;
    }

    public RingRestClient(Auth authOptions) {

        this.authOptions = authOptions;
    }

    public void start() throws Exception {

        hardwareId = getHardwareId(authOptions.getSystemId());

        log.info("UUID={}", hardwareId.toString());

        // get initial session information

        this.authService = new AuthService(authOptions, this);
        this.authService.start();
    }

    public void stop() {
        authService.stop();
    }
    public <T extends ExtendedResponse> T request(RequestOptions requestOptions, Class<T> clazz) throws IOException {

        log.info("Sending request. options={}", requestOptions);

        // 1. need hardwareid                           - completed in contructor
        // 2. need initial session data populated
        // 3. need authorization token refreshed

        requestOptions.addHeader("hardware_id", hardwareId.toString())
                .addHeader("User-Agent", "android:com.ringapp")
                .addHeader("Content-Type",  "application/json");

        if( authService.getAuthTokenResponse() != null ) {
            requestOptions.addHeader("authorization", "Bearer " + authService.getAuthTokenResponse().getAccessToken());
        }

        return requestWithRetry(requestOptions, clazz);
    }

    public <T extends ExtendedResponse> T requestWithRetry(RequestOptions requestOptions, Class<T> clazz) throws IOException {

        return handleRequest(requestOptions, clazz);
    }

    private <T extends ExtendedResponse> T handleRequest(RequestOptions requestOptions, Class<T> clazz) throws IOException {

        try (final CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpUriRequestBase request = buildRequest(requestOptions);

            final HttpClientResponseHandler<ExtendedResponse> responseHandler = new HttpClientResponseHandler<ExtendedResponse>() {
                @Override
                public ExtendedResponse handleResponse(final ClassicHttpResponse response) throws IOException {
                    final int status = response.getCode();

                    if (status >= HttpStatus.SC_SUCCESS && status < HttpStatus.SC_REDIRECTION) {
                        final HttpEntity entity = response.getEntity();

                        try {
                            String json = EntityUtils.toString(entity);

                            log.debug("response body={}", json);

                            return objectMapper.readValue(json, clazz);
                        } catch (final Exception ex) {
                            throw new ClientProtocolException(ex);
                        }
                    } else {
                        log.info("version={}", response.getVersion());
                        log.info("resp code={}", response.getCode());
                        log.info("resp reason={}", response.getReasonPhrase());

                        throw new ClientProtocolException("Unexpected response status: " + status);
                    }
                }
            };

            return (T) httpclient.execute(request, responseHandler);
        }
    }

    private HttpUriRequestBase buildRequest(RequestOptions requestOptions) {

        switch (requestOptions.getMethod()) {
            case GET:
                return addHeaders(new HttpGet(buildUri(requestOptions.getUri())), requestOptions);

            case POST:
                HttpPost postRequest = new HttpPost(buildUri(requestOptions.getUri()));

                postRequest.setEntity(new StringEntity(requestOptions.getJson()));

                return addHeaders(postRequest, requestOptions);

            case PUT:
                HttpPut putRequest = new HttpPut(buildUri(requestOptions.getUri()));

                putRequest.setEntity(new StringEntity(requestOptions.getJson()));

                return addHeaders(putRequest, requestOptions);
        }

        return null;
    }

    private String buildUri(String uri) {

        if( uri.contains("http")) {
            return uri;
        }

        return "https://" + ringApiHost + uri;
    }

    private HttpUriRequestBase addHeaders(HttpUriRequestBase request, RequestOptions requestOptions) {

        if (requestOptions.getHeaders().size() > 0) {
            List<Header> headers = new ArrayList<>();

            for (String name : requestOptions.getHeaders().keySet()) {
                headers.add(new BasicHeader(name, requestOptions.getHeaders().get(name)));
            }

            if (headers.size() > 0) {
                request.setHeaders(headers.toArray(new Header[0]));
            }
        }

        return request;
    }

//    private <T extends ExtendedResponse> T _handleRequest(RequestOptions requestOptions) throws IOException {
//
//        SimpleHttpRequest request = null;
//
//        switch (requestOptions.getMethod()) {
//            case GET:
//                request = SimpleRequestBuilder.get()
//                        .setHttpHost(target)
//                        .setPath(requestOptions.getUri())
//                        .build();
//                break;
//            case POST:
//                request = SimpleRequestBuilder.post()
//                        .setHttpHost(target)
//                        .setPath(requestOptions.getUri())
//                        .setBody(requestOptions.getJson(), ContentType.APPLICATION_JSON)
//                        .build();
//
//                request = addHeaders(request, requestOptions);
//                break;
//            case PUT:
//                request = SimpleRequestBuilder.put()
//                        .setHttpHost(target)
//                        .setPath(requestOptions.getUri())
//                        .setBody(requestOptions.getJson(), ContentType.APPLICATION_JSON)
//                        .build();
//
//                request = addHeaders(request, requestOptions);
//                break;
//        }
//
//        if (request != null) {
//            final Future<SimpleHttpResponse> future = client.execute(
//                    SimpleRequestProducer.create(request),
//                    SimpleResponseConsumer.create(),
//                    new FutureCallback<>() {
//
//                        @Override
//                        public void completed(final SimpleHttpResponse response) {
////                            System.out.println(request + "->" + new StatusLine(response));
////                            System.out.println(response.getBody());
//                        }
//
//                        @Override
//                        public void failed(final Exception ex) {
////                            System.out.println(request + "->" + ex);
//                        }
//
//                        @Override
//                        public void cancelled() {
////                            System.out.println(request + " cancelled");
//                        }
//
//                    });
//            try {
//                SimpleHttpResponse response = future.get();
//
//                return future.get().getBody();
//                return new RingHttpResponse(response);
//            } catch (Exception e) {
//                throw new IOException(e);
//            } finally {
//                if (client != null) {
//                    client.close();
//                }
//            }
//        }
//
//        return null;
//    }


    private class Device {
        private String hardwareId;
    }

    private class SessionDevice {
        private Device device;
    }

    private void clearPreviousAuth() {
        this.authToken = null;
    }

    ////////////////////////////////////////////////////////////////

    private UUID getHardwareId(String systemId) {

        if (systemId != null) {
            return UUID.fromString(systemId);
        }

        // TODO add call to get System UUID....

        // last resort, generate a random one
        return UUID.randomUUID();
    }

}
