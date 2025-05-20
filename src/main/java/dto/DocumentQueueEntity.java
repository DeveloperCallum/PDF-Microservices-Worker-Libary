package dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.willcocks.callum.model.data.Selection;

import java.io.Serializable;
import java.util.*;

public class DocumentQueueEntity implements Serializable {
    @JsonProperty("jobUUID") @Deprecated
    private UUID jobUUID;

    @JsonProperty("documentUUID")
    private UUID documentUUID;

    @JsonProperty("selectionUUID")
    private UUID selectionUUID;

    @JsonProperty("pdfBase64")
    private String pdfBase64Document;

    @JsonProperty("callbackURL")
    private String callbackURL;

    //todo: only send the relevant selections!
    @JsonProperty("selection")
    private Map<Integer, List<Selection>> selection = new HashMap<>();

    @JsonCreator
    public DocumentQueueEntity() {
    }


    public UUID getJobUUID() {
        return jobUUID;
    }

    /**
     * Sets the unique value of the job. each job needs its own ID.
     * @param jobUUID
     */

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

    public void setSelectionUUID(UUID selectionUUID) {
        this.selectionUUID = selectionUUID;
    }

    public Map<Integer, List<Selection>> getSelection() {
        return selection;
    }

    /**
     * Each page needs an ID so that it can be reference back to where it came from.
     * @param documentUUID
     */
    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }
}
