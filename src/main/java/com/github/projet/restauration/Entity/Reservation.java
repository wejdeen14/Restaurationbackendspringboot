package com.github.projet.restauration.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable =false)
    private String restaurant;
    @Column(nullable =false)
    private Date date;
    @Column(nullable =false)
    private int nb_personne;
    //restaurateur
    @ManyToOne
    private Utilisateur restaurateur;
    //client
    @ManyToOne
    private Utilisateur client;





}
