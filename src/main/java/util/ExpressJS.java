package util;

import com.willcocks.callum.eukrea.ServiceResolver;
import dto.Document;
import dto.Image;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestClient;

import java.util.Optional;
import java.util.UUID;

public class ExpressJS {
    private static Logger logger = LoggerFactory.getLogger(ExpressJS.class);

    public static String getDocumentStringFromDocumentUUID(UUID documentUUID, DiscoveryClient discoveryClient) {
        ServiceInstance serviceInstance = ServiceResolver.resolveName(discoveryClient, "EXPRESSJS");
        String getDocumentUUID = "/api/pdf/";
        String getDocumentUUIDWithUUID = getDocumentUUID + documentUUID.toString();

        try{
            RestClient customClient = RestClient.builder().requestFactory(new HttpComponentsClientHttpRequestFactory()).baseUrl(serviceInstance.getUri()).build();
            Document response = customClient.method(HttpMethod.GET).uri(getDocumentUUIDWithUUID).retrieve().body(Document.class);
            return response.getPdfBase64Document();
        }catch (RuntimeException e){
            return null;
        }
    }


    public static Optional<Image> getDocumentMeta(UUID documentUUID, DiscoveryClient discoveryClient) {
        ServiceInstance serviceInstance = ServiceResolver.resolveName(discoveryClient, "EXPRESSJS");
        String getMetaUrl = "/api/pdf/document/meta/";
        String getMetaWithUUID = getMetaUrl + documentUUID.toString();

        RestClient customClient = RestClient.builder().requestFactory(new HttpComponentsClientHttpRequestFactory()).baseUrl(serviceInstance.getUri()).build();
        Optional<Image> response = customClient.method(HttpMethod.GET).uri(getMetaWithUUID).exchange((clientRequest, clientResponse) -> {
            if (clientResponse.getStatusCode() == HttpStatusCode.valueOf(202)) {
                return Optional.empty();
            }

            return Optional.of(clientResponse.bodyTo(Image.class));
        });

        return response;
    }
}

