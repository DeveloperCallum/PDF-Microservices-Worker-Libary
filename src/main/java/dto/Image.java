package dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

public class Image {
    private float height;
    private float width;
    private int numberOfPages;

    //Images are in base64 format, and need decoding.
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String[] images;

    public Image(float height, float width, int numberOfPages) {
        this.height = height;
        this.width = width;
        this.numberOfPages = numberOfPages;
    }

    public Image(float height, float width, int numberOfPages, String[] images) {
        this.height = height;
        this.width = width;
        this.numberOfPages = numberOfPages;
        this.images = images;
    }

    @JsonCreator
    public Image() {
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }
}
