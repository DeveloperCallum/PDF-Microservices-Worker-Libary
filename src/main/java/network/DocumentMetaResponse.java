package network;

import com.fasterxml.jackson.annotation.JsonCreator;
import dto.Image;
import dto.WebCallback;

import java.util.UUID;

public class DocumentMetaResponse extends WebCallback {
    private Image image;
    private UUID documentUUID;

    public DocumentMetaResponse(UUID documentUUID, Image image, String callbackURL, String callbackService) {
        super(callbackURL, callbackService);
        this.image = image;
        this.documentUUID = documentUUID;
    }

    public DocumentMetaResponse(UUID documentUUID, Image image, WebCallback webCallback) {
        super(webCallback);
        this.image = image;
        this.documentUUID = documentUUID;
    }

    //Default constructor for jackson

    @JsonCreator
    public DocumentMetaResponse() {
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }
}
