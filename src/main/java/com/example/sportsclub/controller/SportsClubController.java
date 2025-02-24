package com.example.sportsclub.controller;

import com.example.sportsclub.Entity.SportsClub;  // ✅ Правильный импорт
import com.example.sportsclub.service.SportsClubService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubs")
@RequiredArgsConstructor
public class SportsClubController {  // ❌ Убираем <SportsClub>
    private final SportsClubService service;

    @GetMapping
    public List<SportsClub> getAll() {  // ❌ Убираем <SportsClub>
        return service.getAll();
    }

    @PostMapping
    public SportsClub create(@RequestBody SportsClub club) {
        return service.create(club);
    }
}

