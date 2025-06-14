package network.web.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import dto.Selection;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@JsonPropertyOrder(value = {"documentUUID", "pdfBase64", "selection"})
public class ExtractionWebRequest implements Serializable {

    //Should not be null.
    private UUID documentUUID;
    private UUID selectionUUID = UUID.randomUUID();
    @JsonProperty("callbackURL")
    private String callbackURL;

    @JsonProperty("callbackService")
    private String callbackService;

    @JsonProperty("pdfBase64")
    private String base64Document;

    private Map<Integer, List<Selection>> selection = new HashMap<>();

    public ExtractionWebRequest() {
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public UUID getSelectionUUID() {
        return selectionUUID;
    }

    public void setSelectionUUID(UUID selectionUUID) {
        this.selectionUUID = selectionUUID;
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

    public String getBase64Document() {
        return base64Document;
    }

    public void setBase64Document(String base64Document) {
        this.base64Document = base64Document;
    }

    public Map<Integer, List<Selection>> getSelection() {
        return selection;
    }

    public void setSelection(Map<Integer, List<Selection>> selection) {
        this.selection = selection;
    }
}
