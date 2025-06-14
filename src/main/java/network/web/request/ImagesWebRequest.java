package network.web.request;

import dto.WebCallback;
import java.util.UUID;

/**
 * An object that stores the request incoming from the web controller.
 */
public class ImagesWebRequest extends WebCallback {
    private UUID documentUUID;
    private String base64Document;

    public ImagesWebRequest() {
    }

    public ImagesWebRequest(ImagesWebRequest imagesWebRequest){
        super(imagesWebRequest);
        this.documentUUID = imagesWebRequest.documentUUID;
        this.base64Document = imagesWebRequest.base64Document;
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public String getBase64Document() {
        return base64Document;
    }

    public void setBase64Document(String base64Document) {
        this.base64Document = base64Document;
    }
}
