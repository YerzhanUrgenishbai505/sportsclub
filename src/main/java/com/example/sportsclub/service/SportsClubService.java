package com.example.sportsclub.service;

import com.example.sportsclub.Entity.SportsClub;  // ✅ Правильный импорт
import com.example.sportsclub.repository.SportsClubRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SportsClubService {  // ❌ Убрали <SportsClub>
    private final SportsClubRepository repository;

    public List<SportsClub> getAll() {
        return repository.findAll();
    }

    public SportsClub create(SportsClub club) {
        return repository.save(club);
    }
}
