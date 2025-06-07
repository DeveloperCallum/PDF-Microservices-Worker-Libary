package dto.queue;

import dto.ImageRequest;

import java.util.UUID;

public class ImageQueueEntity extends QueueEntity{
    private final ImageRequest imageRequest;

    public ImageQueueEntity(UUID jobUUID, ImageRequest imageRequest) {
        super(jobUUID);
        this.imageRequest = imageRequest;
    }

    public ImageQueueEntity(ImageRequest imageRequest) {
        this.imageRequest = imageRequest;
    }

    public ImageRequest getImageRequest() {
        return imageRequest;
    }
}
