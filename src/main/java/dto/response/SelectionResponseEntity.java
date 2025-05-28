package dto.response;

import dto.DocumentQueueEntity;

import java.util.UUID;

public class SelectionResponseEntity extends ResponseEntity<DocumentQueueEntity> {
    public SelectionResponseEntity(DocumentQueueEntity payload) {
        super(payload.getDocument().getDocumentUUID(), payload.getJobUUID(), payload);
    }

    public SelectionResponseEntity() {
        super();
    }
}
