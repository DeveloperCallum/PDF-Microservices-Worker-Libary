package dto.queue;

import java.io.Serializable;
import java.util.UUID;

public class QueueEntity implements Serializable {
    private UUID jobUUID;

    public QueueEntity(UUID jobUUID) {
        this.jobUUID = jobUUID;
    }

    public QueueEntity() {
    }

    public UUID getJobUUID() {
        return jobUUID;
    }

    public void setJobUUID(UUID jobUUID) {
        this.jobUUID = jobUUID;
    }
}
