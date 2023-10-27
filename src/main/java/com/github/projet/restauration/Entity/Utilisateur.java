package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

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



}
