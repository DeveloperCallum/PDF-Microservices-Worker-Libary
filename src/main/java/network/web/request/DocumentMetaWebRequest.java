package network.web.request;

import dto.WebCallback;

import java.util.UUID;

public class DocumentMetaWebRequest extends WebCallback {
    private UUID documentUUID;

    private String base64Document;

    public DocumentMetaWebRequest(UUID documentUUID, String base64Document) {
        super();
        this.documentUUID = documentUUID;
        this.base64Document = base64Document;
    }

    public DocumentMetaWebRequest() {
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public String getBase64Document() {
        return base64Document;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public void setBase64Document(String base64Document) {
        this.base64Document = base64Document;
    }
}