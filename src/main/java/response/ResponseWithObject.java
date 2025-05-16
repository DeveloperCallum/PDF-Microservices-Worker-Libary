package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.ResponseEntity;

public class ResponseWithObject<T> extends BaseResponse {
    @JsonProperty("message_detail")
    private T messageDetail;

    public T getMessageDetail() {
        return messageDetail;
    }

    public void setMessageDetail(T messageDetail) {
        this.messageDetail = messageDetail;
    }
}
