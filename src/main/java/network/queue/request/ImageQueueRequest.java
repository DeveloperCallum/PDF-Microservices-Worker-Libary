package network.queue.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import dto.Image;
import network.web.request.ImagesWebRequest;

import java.util.UUID;

public class ImageQueueRequest {
    private ImagesWebRequest payload;

    //TODO: Separate this, make imageMeta its own object that gets used in Image.
    private Image imageMetaData;
    private UUID responseManagerUUID;
    private UUID jobUUID = UUID.randomUUID();
    private int start;
    private int end;

    public ImageQueueRequest(UUID responseManagerUUID, ImagesWebRequest payload) {
        this.payload = payload;
        this.responseManagerUUID = responseManagerUUID;
    }

    @JsonCreator
    public ImageQueueRequest() {
    }

    public ImagesWebRequest getPayload() {
        return payload;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setPayload(ImagesWebRequest payload) {
        this.payload = payload;
    }

    public UUID getResponseManagerUUID() {
        return responseManagerUUID;
    }

    public void setResponseManagerUUID(UUID responseManagerUUID) {
        this.responseManagerUUID = responseManagerUUID;
    }

    public void setJobUUID(UUID jobUUID) {
        this.jobUUID = jobUUID;
    }

    public UUID getJobUUID() {
        return jobUUID;
    }

    public Image getImageMetaData() {
        return imageMetaData;
    }

    public void setImageMetaData(Image imageMetaData) {
        this.imageMetaData = imageMetaData;
    }
}
