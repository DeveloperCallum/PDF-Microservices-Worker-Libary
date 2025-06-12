package network;

import dto.Image;
import dto.WebCallback;

public class DocumentMetaResponse extends WebCallback {
    private Image image;

    public DocumentMetaResponse(Image image, String callbackURL, String callbackService) {
        super(callbackURL, callbackService);
        this.image = image;
    }

    public DocumentMetaResponse(Image image, WebCallback webCallback) {
        super(webCallback);
        this.image = image;
    }

    public Image getImage() {
        return image;
    }
}
