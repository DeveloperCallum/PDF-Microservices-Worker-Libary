package network.web.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import dto.Image;

import java.util.UUID;

public class DocumentMetaApiResponse {
    private UUID documentUUID;
    private Image imageMeta;

    public DocumentMetaApiResponse(UUID documentUUID, Image imageMeta) {
        this.documentUUID = documentUUID;
        this.imageMeta = imageMeta;
    }

    @JsonCreator
    public DocumentMetaApiResponse() {
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public Image getImageMeta() {
        return imageMeta;
    }

    public void setImageMeta(Image imageMeta) {
        this.imageMeta = imageMeta;
    }
}
