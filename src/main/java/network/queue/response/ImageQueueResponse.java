package network.queue.response;

import network.queue.request.ImageQueueRequest;
import network.web.request.ImagesWebRequest;

import java.io.Serializable;
import java.util.List;

public class ImageQueueResponse implements Serializable {
    private ImageQueueRequest imageQueueRequest;
    private List<String> imageEncodedArr;

    public ImageQueueResponse(ImageQueueRequest imageQueueRequest) {
        this.imageQueueRequest = imageQueueRequest;
    }

    public ImageQueueResponse(ImageQueueRequest imageQueueRequest, List<String> imageEncodedArr) {
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

    public List<String> getImageEncodedArr() {
        return imageEncodedArr;
    }

    public void setImageEncodedArr(List<String> imageEncodedArr) {
        this.imageEncodedArr = imageEncodedArr;
    }
}
