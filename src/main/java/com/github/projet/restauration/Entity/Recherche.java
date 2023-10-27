package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "recherche")
public class Recherche {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable =false)
    private String criterePersonnel;

}
