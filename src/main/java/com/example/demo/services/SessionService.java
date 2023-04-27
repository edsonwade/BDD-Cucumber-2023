package com.example.demo.services;

import com.example.demo.persistence.models.Session;
import com.example.demo.persistence.repositories.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "session")
@RequiredArgsConstructor
public class SessionService {
    private final SessionRepository sessionRepository;

    public List<Session> findAllSessions() {
        return sessionRepository.findAll();
    }
}
