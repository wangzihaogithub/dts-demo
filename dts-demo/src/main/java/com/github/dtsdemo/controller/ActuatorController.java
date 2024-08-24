package com.github.dtsdemo.controller;

import com.github.dtsdemo.DtsDemoApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/actuator")
public class ActuatorController {

    @RequestMapping("/health")
    public ResponseEntity<Map> health() {
        HttpStatus status;
        Map<String, String> body;
        if (DtsDemoApplication.isStartup()) {
            status = HttpStatus.OK;
            body = Collections.singletonMap("status", "UP");
        } else {
            status = HttpStatus.SERVICE_UNAVAILABLE;
            body = Collections.singletonMap("status", "DOWN");
        }
        return new ResponseEntity<>(body, status);
    }
}
