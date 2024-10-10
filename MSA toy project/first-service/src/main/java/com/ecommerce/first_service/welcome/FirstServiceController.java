package com.ecommerce.first_service.welcome;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/first-service")
@Slf4j
@RestController
public class FirstServiceController {

    @GetMapping("/welcome")
    public String welcome() {

        return "welcome to the first service!";
    }
}
