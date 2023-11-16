package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable =false)
    private String nom;
    //plate
    @OneToMany(mappedBy = "menu")
    private Set<Plats> plates;
    //restaurant
    @ManyToOne
    private Restaurant restaurant;



}
