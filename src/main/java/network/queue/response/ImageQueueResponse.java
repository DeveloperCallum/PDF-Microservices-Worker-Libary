package network.queue.response;

import network.queue.request.ImageQueueRequest;
import network.web.request.ImagesWebRequest;

import java.io.Serializable;

public class ImageQueueResponse implements Serializable {
    private ImageQueueRequest imageQueueRequest;
    private String[] imageEncodedArr;

    public ImageQueueResponse(ImageQueueRequest imageQueueRequest) {
        this.imageQueueRequest = imageQueueRequest;
    }

    public ImageQueueResponse(ImageQueueRequest imageQueueRequest, String[] imageEncodedArr) {
        this.imageQueueRequest = imageQueueRequest;
        this.imageEncodedArr = imageEncodedArr;
    }

    public ImageQueueResponse() {
    }

    public ImageQueueRequest getImageQueueRequest() {
        return imageQueueRequest;
    }

    public void setImageQueueRequest(ImageQueueRequest imageQueueRequest) {
        this.imageQueueRequest = imageQueueRequest;
    }

    public String[] getImageEncodedArr() {
        return imageEncodedArr;
    }

    public void setImageEncodedArr(String[] imageEncodedArr) {
        this.imageEncodedArr = imageEncodedArr;
    }
}
