package com.service.user_service.user.controller;

import com.service.user_service.user.dto.ShowUserReqDto;
import com.service.user_service.user.dto.ShowUserResDto;
import com.service.user_service.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> showUser(@PathVariable Long id) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", StandardCharsets.UTF_8));

        ShowUserResDto result = userService.showUser(ShowUserReqDto.builder().id(id).build());

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(result);
    }
}

