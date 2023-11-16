package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

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
    //menu
    @OneToMany(mappedBy = "restaurant")
    private Set<Menu> Menus;
    //restaurateur
    @ManyToOne
    private Utilisateur utilisateur;
}
