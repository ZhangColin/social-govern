package com.cartisan.nacos.cloud.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author colin
 */
@RestController
public class TestController {
    private final RestTemplate restTemplate;

    public TestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/echo/{string}")
    public String echo(@PathVariable String string) {
        return restTemplate.getForObject("http://nacos-spring-cloud-provider/echo/" + string, String.class);
    }
}
