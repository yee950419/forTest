package com.service.user_service.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {

        log.info("test success!");

        return "test success!";
    }

    @GetMapping("/connection-test")
    public String connectionTest() {

        String serverURL = "http://127.0.0.1:8081/test";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(serverURL, String.class);

        log.info("response : " + response.getBody());

        return "connection success!";
    }
}
