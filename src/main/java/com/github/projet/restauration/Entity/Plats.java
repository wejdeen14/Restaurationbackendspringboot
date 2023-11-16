package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@Data
@NoArgsConstructor
@Entity
@Table(name = "plats")
public class Plats {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        @Column(nullable =false)
        private String nom;
        private float prix;
        //menus
    @ManyToOne
    private Menu menu;
    //offreSpecial
    @OneToMany(mappedBy = "plat")
    private Set<OffreSpecial> offreSpecials;

}
