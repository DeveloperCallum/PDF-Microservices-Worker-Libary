package util;

import com.willcocks.callum.eukrea.ServiceResolver;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.Serializable;
import java.util.function.Consumer;

public class SendWebhookToService<V> implements Consumer<V>, Serializable {
    private String serviceName;
    private String callbackURL;
    private final DiscoveryClient discoveryClient;

    public SendWebhookToService(String serviceName, String callbackURL, DiscoveryClient discoveryClient) {
        this.serviceName = serviceName;
        this.callbackURL = callbackURL;
        this.discoveryClient = discoveryClient;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    @Override
    public void accept(V t) {
        ServiceInstance serviceInstance = ServiceResolver.resolveName(discoveryClient, serviceName);

        System.out.println("URL: " + serviceInstance.getUri() + "/" + callbackURL); //TODO: SEND REQUEST TO URL!

        WebClient webClient = WebClient.builder().baseUrl(serviceInstance.getUri().toString()).build();
        Mono<ResponseEntity<Void>> response = webClient.method(HttpMethod.POST).uri(callbackURL).bodyValue(t).retrieve().toBodilessEntity();
        response.subscribe(null, throwable -> {
            LoggerFactory.getLogger(SendWebhookToService.class).error("sent HTTP request to server, server responded with an error.");
        });
    }
}
