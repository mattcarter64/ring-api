package org.mcsoft.ringapi;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Data
@Accessors(chain = true)
@ToString
public class RequestOptions {
    private String uri;
    private String json;
    private MethodType method = MethodType.GET;
    private ReturnType returnType = ReturnType.JSON;
    private int retries = 0;
    private int timeout = 20; // seconds
    private Map<String, String> headers = new HashMap<>();

    public RequestOptions addHeader(String name, String value) {
        headers.put(name, value);
        return this;
    }

    public long getTimeoutMs() {
        return TimeUnit.SECONDS.toMillis(timeout);
    }
}
