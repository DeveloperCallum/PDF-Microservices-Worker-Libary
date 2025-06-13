package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class WebCallback implements Serializable {
    @JsonProperty("callbackURL")
    private String callbackURL;

    @JsonProperty("callbackService")
    private String callbackService;

    public WebCallback(String callbackURL, String callbackService) {
        this.callbackURL = callbackURL;
        this.callbackService = callbackService;
    }

    public WebCallback(WebCallback webCallback) {
        this.callbackService = webCallback.callbackService;
        this.callbackURL = webCallback.callbackURL;
    }

    public WebCallback() {
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    public String getCallbackService() {
        return callbackService;
    }

    public void setCallbackService(String callbackService) {
        this.callbackService = callbackService;
    }
}
