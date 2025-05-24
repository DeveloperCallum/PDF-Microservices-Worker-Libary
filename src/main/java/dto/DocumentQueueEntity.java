package dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.willcocks.callum.model.data.Selection;

import java.io.Serializable;
import java.util.*;

public class DocumentQueueEntity implements Serializable {
    @JsonProperty("jobUUID")
    private UUID jobUUID;

    @JsonProperty("documentUUID")
    private UUID documentUUID;

    @JsonProperty("selectionUUID")
    private UUID selectionUUID;

    @JsonProperty("pdfBase64")
    private String pdfBase64Document;

    @JsonProperty("callbackURL")
    private String callbackURL;

    @JsonProperty("callbackService")
    private String callbackService;

    @JsonProperty("selection")
    private Map<Integer, List<Selection>> selection = new HashMap<>();

    @JsonCreator
    public DocumentQueueEntity() {
    }


    public UUID getJobUUID() {
        return jobUUID;
    }
    public void setJobUUID(UUID jobUUID) {
        this.jobUUID = jobUUID;
    }

    public String getPdfBase64Document() {
        return pdfBase64Document;
    }

    public void setPdfBase64Document(String pdfBase64Document) {
        this.pdfBase64Document = pdfBase64Document;
    }

    public Map<Integer, List<Selection>> getSelectionMap() {
        return selection;
    }

    public void setSelection(Map<Integer, List<Selection>> selection) {
        this.selection = selection;
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public UUID getSelectionUUID() {
        return selectionUUID;
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public String getCallbackService() {
        return callbackService;
    }

    public void setSelectionUUID(UUID selectionUUID) {
        this.selectionUUID = selectionUUID;
    }

    public Map<Integer, List<Selection>> getSelection() {
        return selection;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    public void setCallbackService(String callbackService) {
        this.callbackService = callbackService;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }
}
