package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebCallback {
    @JsonProperty("callbackURL")
    private String callbackURL;

    @JsonProperty("callbackService")
    private String callbackService;

    public WebCallback(String callbackURL, String callbackService) {
        this.callbackURL = callbackURL;
        this.callbackService = callbackService;
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
