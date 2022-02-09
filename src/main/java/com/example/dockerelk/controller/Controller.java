package com.example.dockerelk.controller;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Logger logger = LoggerFactory.getLogger("LoggerController 의 로그");
    @GetMapping("/log")
    public void log() {
        logger.error("testlogstash!");
    }
}
