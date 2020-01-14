package io.spring.cloud.samples.fortuneteller.ui.services.fortunes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FortuneService {

    @Autowired
    RestTemplate restTemplate;

    public Fortune randomFortune() {
        return new Fortune(1L, "Could not get your fortune");
    }
}
