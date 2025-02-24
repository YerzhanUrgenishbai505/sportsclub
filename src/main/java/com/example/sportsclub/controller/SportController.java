package com.example.sportsclub.controller;

import com.example.sportsclub.Entity.Sport;
import com.example.sportsclub.service.SportService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports")
@RequiredArgsConstructor
public class SportController {
    private final SportService service;

    @GetMapping
    public List<Sport> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Sport create(@RequestBody Sport sport) {
        return service.create(sport);
    }
}
