package dto.extraction;

import com.willcocks.callum.model.data.Selection;
import dto.extraction.Document;

import java.util.*;

public class DocumentQueueEntity {
    private UUID jobUUID;
    private final Document document = new Document();

    public DocumentQueueEntity(UUID jobUUID) {
        this.jobUUID = jobUUID;
    }

    public DocumentQueueEntity(UUID jobUUID, UUID documentUUID) {
        this.jobUUID = jobUUID;

        this.getDocument().setDocumentUUID(documentUUID);
    }

    public DocumentQueueEntity(UUID jobUUID, UUID documentUUID, String pdfBase64Document) {
        this(jobUUID, documentUUID);

        this.getDocument().setPdfBase64Document(pdfBase64Document);
    }

    public DocumentQueueEntity(UUID jobUUID, UUID documentUUID, String pdfBase64Document, Map<Integer, List<Selection>> selections) {
        this(jobUUID, documentUUID, pdfBase64Document);

        this.getDocument().setSelection(selections);
    }

    public DocumentQueueEntity() {
    }

    public Document getDocument() {
        return document;
    }

    public UUID getJobUUID() {
        return jobUUID;
    }
}
