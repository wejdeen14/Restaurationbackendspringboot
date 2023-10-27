package com.github.projet.restauration.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable =false)
    private String client;
    @Column(nullable =false)
    private String restaurant;
    @Column(nullable =false)
    private Date date;
    @Column(nullable =false)
    private int nb_personne;


}
