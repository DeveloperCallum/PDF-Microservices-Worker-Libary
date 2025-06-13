package network;

import java.io.Serializable;
import java.util.UUID;

//TODO: Remove this, this is unnecessary.
public class ResponseEntity<V> implements Serializable {
    private UUID documentKey;
    private UUID jobKey;
    private V payload;

    public ResponseEntity(UUID documentKey, UUID jobKey, V payload) {
        this.documentKey = documentKey;
        this.jobKey = jobKey;
        this.payload = payload;
    }

    public ResponseEntity() {
    }

    public UUID getDocumentKey() {
        return documentKey;
    }

    public UUID getJobKey() {
        return jobKey;
    }

    public V getPayload() {
        return payload;
    }

    public void setDocumentKey(UUID documentKey) {
        this.documentKey = documentKey;
    }

    public void setJobKey(UUID jobKey) {
        this.jobKey = jobKey;
    }

    public void setPayload(V payload) {
        this.payload = payload;
    }
}
