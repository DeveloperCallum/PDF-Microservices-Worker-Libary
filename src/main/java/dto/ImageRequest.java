package dto;

import java.util.UUID;

public class ImageRequest {
    private UUID documentUUID;
    private String Base64Document;

    public ImageRequest() {
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public String getBase64Document() {
        return Base64Document;
    }

    public void setBase64Document(String base64Document) {
        Base64Document = base64Document;
    }
}
