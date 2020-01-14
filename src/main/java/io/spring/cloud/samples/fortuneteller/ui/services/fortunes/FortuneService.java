package io.spring.cloud.samples.fortuneteller.ui.services.fortunes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@EnableConfigurationProperties(FortuneProperties.class)
public class FortuneService {

    @Autowired
    FortuneProperties fortuneProperties;

    @Autowired
    RestTemplate restTemplate;

    public Fortune randomFortune() {
        return new Fortune(1L, "Could not get your fortune");
    }
}
