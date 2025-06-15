package network.queue.request;

import dto.Document;

import java.util.*;

public class ExtractionQueueRequest {
    private UUID jobUUID; //Unique ID to identify each individual request.
    private UUID responseManagerUUID; //Unique ID to identify request manager.
    private final Document document = new Document();

    public ExtractionQueueRequest(UUID jobUUID, UUID responseManagerUUID) {
        this.jobUUID = jobUUID;
        this.responseManagerUUID = responseManagerUUID;
    }

    public ExtractionQueueRequest() {
    }

    public Document getDocument() {
        return document;
    }

    public UUID getJobUUID() {
        return jobUUID;
    }

    public UUID getResponseManagerUUID() {
        return responseManagerUUID;
    }
}
