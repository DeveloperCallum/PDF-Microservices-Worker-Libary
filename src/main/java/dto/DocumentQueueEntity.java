package dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.willcocks.callum.model.data.Selection;

import java.io.Serializable;
import java.util.*;

public class DocumentQueueEntity implements Serializable {
    @JsonProperty("job_uuid")
    private UUID jobUUID;

    @JsonProperty("page_uuid")
    private UUID pageUUID;

    @JsonProperty("start_page")
    private int startPage;
    @JsonProperty("end_page")
    private int endPage;
    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("pdf_document")
    private String pdfBase64Document;

    //todo: only send the relevant selections!
    @JsonProperty("selection")
    private Map<Integer, List<Selection>> selection = new HashMap<>();

    @JsonCreator
    public DocumentQueueEntity() {
    }

    public UUID getJobUUID() {
        return jobUUID;
    }

    /**
     * Sets the unique value of the job. each job needs its own ID.
     * @param jobUUID
     */
    public void setJobUUID(UUID jobUUID) {
        this.jobUUID = jobUUID;
    }

    @Deprecated
    public int getStartPage() {
        return startPage;
    }

    public void setStartPage(int startPage) {
        this.startPage = startPage;
    }

    @Deprecated
    public int getEndPage() {
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getPdfBase64Document() {
        return pdfBase64Document;
    }

    public void setPdfBase64Document(String pdfBase64Document) {
        this.pdfBase64Document = pdfBase64Document;
    }

    public Map<Integer, List<Selection>> getSelectionMap() {
        return selection;
    }

    public void setSelection(Map<Integer, List<Selection>> selection) {
        this.selection = selection;
    }

    public UUID getPageUUID() {
        return pageUUID;
    }

    /**
     * Each page needs an ID so that it can be reference back to where it came from.
     * @param pageUUID
     */
    public void setPageUUID(UUID pageUUID) {
        this.pageUUID = pageUUID;
    }
}
