package dto.response;

import dto.ImageRequest;

public class ImageResponse {
    private ImageRequest request;
    private String[] imageEncodedArr;

    public ImageResponse(ImageRequest request) {
        this.request = request;
    }

    public ImageResponse(ImageRequest request, String[] imageEncodedArr) {
        this.request = request;
        this.imageEncodedArr = imageEncodedArr;
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
