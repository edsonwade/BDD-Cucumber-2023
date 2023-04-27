package com.example.demo.services;

import com.example.demo.persistence.models.Speaker;
import com.example.demo.persistence.repositories.SpeakerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "speaker")
@RequiredArgsConstructor
public class SpeakerService {
    private final SpeakerRepository speakerRepository;

    public List<Speaker> findAllSpeakers() {
        return speakerRepository.findAll();
    }
}
