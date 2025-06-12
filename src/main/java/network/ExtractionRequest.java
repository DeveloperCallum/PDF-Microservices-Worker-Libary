package network;

import com.willcocks.callum.model.data.Selection;
import dto.Document;

import java.util.*;

public class ExtractionRequest {
    private UUID jobUUID;
    private final Document document = new Document();

    public ExtractionRequest(UUID jobUUID) {
        this.jobUUID = jobUUID;
    }

    public ExtractionRequest(UUID jobUUID, UUID documentUUID) {
        this.jobUUID = jobUUID;

        this.getDocument().setDocumentUUID(documentUUID);
    }

    public ExtractionRequest(UUID jobUUID, UUID documentUUID, String pdfBase64Document) {
        this(jobUUID, documentUUID);

        this.getDocument().setPdfBase64Document(pdfBase64Document);
    }

    public ExtractionRequest(UUID jobUUID, UUID documentUUID, String pdfBase64Document, Map<Integer, List<Selection>> selections) {
        this(jobUUID, documentUUID, pdfBase64Document);

        this.getDocument().setSelection(selections);
    }

    public ExtractionRequest() {
    }

    public Document getDocument() {
        return document;
    }

    public UUID getJobUUID() {
        return jobUUID;
    }
}
