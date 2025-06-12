package dto;

import java.io.Serializable;
import java.util.UUID;

public class DocumentMetaQueueEntity implements Serializable {
    private UUID documentUUID;
    private String base64Document;

    public DocumentMetaQueueEntity(UUID documentUUID, String base64Document) {
        this.documentUUID = documentUUID;
        this.base64Document = base64Document;
    }

    public DocumentMetaQueueEntity() {
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