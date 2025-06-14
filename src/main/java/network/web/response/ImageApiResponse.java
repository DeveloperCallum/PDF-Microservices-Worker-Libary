package network.web.response;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImageApiResponse {
    private int numberOfImages;
    private List<String> imageChunks = new ArrayList<>();

    public ImageApiResponse(int numberOfImages, String[] imageChunks) {
        this.numberOfImages = numberOfImages;
        this.imageChunks.addAll(Arrays.asList(imageChunks));
    }

    public ImageApiResponse(int numberOfImages, List<String> imageChunks) {
        this.numberOfImages = numberOfImages;
        this.imageChunks = imageChunks;
    }

    @JsonCreator
    public ImageApiResponse() {
    }

    public void setNumberOfImages(int numberOfImages) {
        this.numberOfImages = numberOfImages;
    }

    public int getNumberOfImages() {
        return numberOfImages;
    }

    public List<String> getImageChunks() {
        return imageChunks;
    }
}
