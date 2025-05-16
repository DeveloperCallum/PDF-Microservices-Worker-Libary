package dto.response;

import java.io.Serializable;
import java.util.UUID;

public class ResponseEntity<V> implements Serializable {
    private UUID pageKey;
    private UUID jobKey;
    private V payload;

    public ResponseEntity(UUID pageKey, UUID jobKey, V payload) {
        this.pageKey = pageKey;
        this.jobKey = jobKey;
        this.payload = payload;
    }

    public ResponseEntity() {
    }

    public UUID getPageKey() {
        return pageKey;
    }

    public UUID getJobKey() {
        return jobKey;
    }

    public V getPayload() {
        return payload;
    }

    public void setPageKey(UUID pageKey) {
        this.pageKey = pageKey;
    }

    public void setJobKey(UUID jobKey) {
        this.jobKey = jobKey;
    }

    public void setPayload(V payload) {
        this.payload = payload;
    }
}
