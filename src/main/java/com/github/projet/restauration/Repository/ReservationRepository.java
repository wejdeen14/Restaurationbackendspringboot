package com.github.projet.restauration.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.projet.restauration.Entity.Reservation;
import com.github.projet.restauration.Entity.Utilisateur;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

    // Autres méthodes du repository

    // Trouver toutes les réservations en attente de validation
}
