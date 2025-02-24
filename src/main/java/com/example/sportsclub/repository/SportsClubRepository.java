package com.example.sportsclub.repository;  // ✅ Проверь, что папка называется "repository"

import com.example.sportsclub.Entity.SportsClub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsClubRepository extends JpaRepository<SportsClub, Long> { }
