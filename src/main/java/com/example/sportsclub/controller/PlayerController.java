package com.example.sportsclub.controller;

import com.example.sportsclub.Entity.Player;
import com.example.sportsclub.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @GetMapping
    public List<Player> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Player create(@RequestBody Player player) {
        return service.create(player);
    }
}
