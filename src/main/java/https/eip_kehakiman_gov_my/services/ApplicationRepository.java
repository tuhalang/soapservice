package https.eip_kehakiman_gov_my.services;

import https.eip_kehakiman_gov_my.services.Info;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class ApplicationRepository {

    private static final Map<String, Info> infos = new HashMap<>();

    @PostConstruct
    public void initData() {
        // initialize countries map
    }
}
