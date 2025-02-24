package com.example.sportsclub.service;

import com.example.sportsclub.Entity.Sport;
import com.example.sportsclub.repository.SportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SportService {
    private final SportRepository repository;

    public List<Sport> getAll() {
        return repository.findAll();
    }

    public Sport create(Sport sport) {
        return repository.save(sport);
    }
}
