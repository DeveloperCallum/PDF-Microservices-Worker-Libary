package util;

import com.willcocks.callum.eukrea.ServiceResolver;
import dto.Document;
import dto.Image;
import network.web.response.DocumentMetaApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.UUID;

public class ExpressJS {
    private static Logger logger = LoggerFactory.getLogger(ExpressJS.class);

    public static String getDocumentStringFromDocumentUUID(UUID documentUUID, DiscoveryClient discoveryClient) {
        ServiceInstance serviceInstance = ServiceResolver.resolveName(discoveryClient, "EXPRESSJS");
        String getDocumentUUID = "/api/pdf/";
        String getDocumentUUIDWithUUID = getDocumentUUID + documentUUID.toString();

        try {
            RestClient customClient = RestClient.builder().requestFactory(new HttpComponentsClientHttpRequestFactory()).baseUrl(serviceInstance.getUri()).build();
            Document response = customClient.method(HttpMethod.GET).uri(getDocumentUUIDWithUUID).retrieve().body(Document.class);
            return response.getPdfBase64Document();
        } catch (RuntimeException e) {
            return null;
        }
    }


    public static Mono<DocumentMetaApiResponse> getDocumentMeta(UUID documentUUID, DiscoveryClient discoveryClient) {
        ServiceInstance serviceInstance = ServiceResolver.resolveName(discoveryClient, "EXPRESSJS");
        String getMetaUrl = "/api/pdf/document/meta/";
        String getMetaWithUUID = getMetaUrl + documentUUID.toString();

        WebClient client = WebClient.builder().defaultHeader("X-Trace-Id", MDC.get("traceId")).baseUrl(serviceInstance.getUri().toString()).build();
        return client.get().uri(getMetaWithUUID).exchangeToMono(clientResponse -> {
            if (clientResponse.statusCode() == HttpStatusCode.valueOf(202)) {
                return Mono.empty();
            }

            return clientResponse.bodyToMono(DocumentMetaApiResponse.class);
        });
    }
}

