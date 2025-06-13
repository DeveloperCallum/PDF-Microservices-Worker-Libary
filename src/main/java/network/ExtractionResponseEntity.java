package network;

//TODO: remove extends.
public class ExtractionResponseEntity extends ResponseEntity<ExtractionRequest> {
    public ExtractionResponseEntity(ExtractionRequest payload) {
        super(payload.getDocument().getDocumentUUID(), payload.getJobUUID(), payload);
    }

    public ExtractionResponseEntity() {
        super();
    }
}
