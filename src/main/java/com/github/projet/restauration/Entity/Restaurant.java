package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable =false)
    private String nom;
    @Column(nullable =false)
    private String pays;
    @Column(nullable =false)
    private String ville;
    @Column(nullable =false)
    private String photo;
    @Column(nullable =false)
    private String menu;


}
