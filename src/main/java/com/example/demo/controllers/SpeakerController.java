package com.example.demo.controllers;

import com.example.demo.persistence.models.Speaker;
import com.example.demo.services.SpeakerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/speakers")
@RequiredArgsConstructor
public class SpeakerController {
    private final SpeakerService speakerService;

    @GetMapping
    public ResponseEntity<List<Speaker>> listAllSessions() {
        return ResponseEntity
                .ok()
                .body(speakerService.findAllSpeakers());
    }
}
