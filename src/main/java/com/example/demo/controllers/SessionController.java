package com.example.demo.controllers;


import com.example.demo.persistence.models.Session;
import com.example.demo.services.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/sessions")
@RequiredArgsConstructor
public class SessionController {

    private final SessionService sessionService;

    @GetMapping
    public ResponseEntity<List<Session>> listAllSessions() {
        return ResponseEntity
                .ok()
                .body(sessionService.findAllSessions());
    }
}
