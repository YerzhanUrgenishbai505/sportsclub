package com.example.sportsclub.Entity;  // ✅ Изменяем Entity на model
import com.example.sportsclub.Entity.Player;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private SportsClub sportsClub;  // ✅ Убрали полный путь

    @ManyToOne
    private Sport sport;  // ✅ Убрали полный путь
}
