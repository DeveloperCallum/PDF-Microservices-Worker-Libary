package dto.extraction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.willcocks.callum.model.data.Selection;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Document implements Serializable {
    @JsonProperty("documentUUID")
    private UUID documentUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("pdfBase64")
    private String pdfBase64Document;

    @JsonProperty("selection")
    private Map<Integer, List<Selection>> selectionMap = new HashMap<>();

    @JsonCreator
    public Document() {
    }

    public void addSelection(Map<Integer, List<Selection>> additionalSelection){
        additionalSelection.forEach((integer, selections) -> {
            selectionMap.merge(integer, selections, (list1, list2) -> list2);
        });
    }

    public Map<Integer, List<Selection>> getSelectionMap() {
        return selectionMap;
    }

    public void setSelection(Map<Integer, List<Selection>> selection) {
        this.selectionMap = selection;
    }

    public UUID getDocumentUUID() {
        return documentUUID;
    }

    public void setDocumentUUID(UUID documentUUID) {
        this.documentUUID = documentUUID;
    }

    public String getPdfBase64Document() {
        return pdfBase64Document;
    }

    public void setPdfBase64Document(String pdfBase64Document) {
        this.pdfBase64Document = pdfBase64Document;
    }
}
