package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "commantaire")
public class Commantaire {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable =false)
    private String text;
    @Column(nullable =false)
    private String auteur;
    @Column(nullable =false)
    private String datePublication;


}
