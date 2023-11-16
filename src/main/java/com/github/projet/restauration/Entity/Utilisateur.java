package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(nullable =false)
    private String nom;
    @Column(nullable =false)
    private String prenom;
    @Column(nullable =false ,unique = true )
    private String email;
    @Column(nullable =false)
    private String password;
    @Column(nullable =false)
    private String role;
    //restaurant
    @OneToMany(mappedBy = "utilisateur")
    private Set<Restaurant> restaurants;
    //reservation
    @OneToMany(mappedBy = "restaurateur")
    private Set<Reservation> reservations;
    //reservation
    @OneToMany(mappedBy = "client")
    private Set<Reservation> resarvations;
    //commentaire
    @OneToMany(mappedBy = "auteur")
    private Set<Commantaire> commantaires;
}
