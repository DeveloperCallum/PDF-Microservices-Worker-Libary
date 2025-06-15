package network.queue.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import network.queue.request.ExtractionQueueRequest;

import java.util.UUID;

//TODO: remove extends.
public class ExtractionQueueResponse {
    private UUID documentUUID;
    private UUID jobUUID;
    private UUID responseManagerUUID;
    private ExtractionQueueRequest payload;

    public ExtractionQueueResponse(ExtractionQueueRequest payload) {
        this.documentUUID = payload.getDocument().getDocumentUUID();
        this.jobUUID = payload.getJobUUID();
        this.payload = payload;
        this.responseManagerUUID = payload.getResponseManagerUUID();
    }

    @JsonCreator
    public ExtractionQueueResponse() {

    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public UUID getJobUUID() {
        return jobUUID;
    }
    public ExtractionQueueRequest getPayload() {
        return payload;
    }

    public UUID getResponseManagerUUID() {
        return responseManagerUUID;
    }
}
