package dto.response;

import dto.DocumentQueueEntity;

import java.util.UUID;

public class DocumentResponseEntity extends ResponseEntity<DocumentQueueEntity> {
    public DocumentResponseEntity(UUID pageKey, UUID jobKey, DocumentQueueEntity payload) {
        super(pageKey, jobKey, payload);
    }

    public DocumentResponseEntity() {
        super();
    }
}
