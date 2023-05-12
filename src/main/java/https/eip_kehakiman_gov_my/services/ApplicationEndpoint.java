package https.eip_kehakiman_gov_my.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ApplicationEndpoint {
    private static final String NAMESPACE_URI = "https://eip.kehakiman.gov.my/services/";

    private ApplicationRepository applicationRepository;

    @Value("${sleep:10000}")
    private Integer sleepTime;

    @Autowired
    public ApplicationEndpoint(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "submitApplicationRequest")
    @ResponsePayload
    public SubmitApplicationResponse getInfo(@RequestPayload SubmitApplicationRequest request) throws InterruptedException {
        SubmitApplicationResponse response = new SubmitApplicationResponse();
        System.out.println("Sleep in " + sleepTime + " ms");
        Thread.sleep(sleepTime);
        response.setData(request.getData());
        return response;
    }
}
