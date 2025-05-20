package dto.response;

import dto.DocumentQueueEntity;

import java.util.UUID;

public class SelectionResponseEntity extends ResponseEntity<DocumentQueueEntity> {
    private UUID selectionUUID;
    public SelectionResponseEntity(DocumentQueueEntity payload) {
        super(payload.getDocumentUUID(), payload.getJobUUID(), payload);
        this.selectionUUID = payload.getSelectionUUID();
    }

    public UUID getSelectionUUID() {
        return selectionUUID;
    }

    public void setSelectionUUID(UUID selectionUUID) {
        this.selectionUUID = selectionUUID;
    }

    public SelectionResponseEntity() {
        super();
    }
}
