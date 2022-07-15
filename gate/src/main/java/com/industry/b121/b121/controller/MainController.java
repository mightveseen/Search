package com.industry.b121.b121.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;

@Slf4j
@RestController
public class MainController {

    @ResponseStatus(OK)
    @GetMapping("/test")
    public String test() {
        return "Successfully";
    }
}
