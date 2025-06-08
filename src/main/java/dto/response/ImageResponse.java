package dto.response;

import dto.ImageRequest;

import java.io.Serializable;

public class ImageResponse implements Serializable {
    private ImageRequest request;
    private String[] imageEncodedArr;

    public ImageResponse(ImageRequest request) {
        this.request = request;
    }

    public ImageResponse(ImageRequest request, String[] imageEncodedArr) {
        this.request = request;
        this.imageEncodedArr = imageEncodedArr;
    }

    public ImageResponse() {
    }

    public void setRequest(ImageRequest request) {
        this.request = request;
    }

    public ImageRequest getRequest() {
        return request;
    }

    public String[] getImageEncodedArr() {
        return imageEncodedArr;
    }

    public void setImageEncodedArr(String[] imageEncodedArr) {
        this.imageEncodedArr = imageEncodedArr;
    }
}
