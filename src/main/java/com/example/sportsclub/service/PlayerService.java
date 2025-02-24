package com.example.sportsclub.service;

import com.example.sportsclub.Entity.Player;  // ✅ Правильный импорт
import com.example.sportsclub.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;

    public List<Player> getAll() {
        return repository.findAll();
    }

    public Player create(Player player) {
        return repository.save(player);
    }
}
