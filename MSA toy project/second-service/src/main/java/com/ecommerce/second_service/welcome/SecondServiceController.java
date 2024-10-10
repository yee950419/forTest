package com.ecommerce.second_service.welcome;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/second-service")
@Slf4j
@RestController
public class SecondServiceController {

    @GetMapping("/welcome")
    public String welcome() {

        return "welcome to the second service!";
    }
}
