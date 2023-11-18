package com.github.projet.restauration.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.projet.restauration.Entity.Reservation;
import com.github.projet.restauration.Repository.ReservationRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/api/reservation")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @ResponseBody
    @GetMapping("reservations")
    public List<Reservation> getAllReservations() {
        List<Reservation> reservations = reservationRepository.findAll();
        System.out.println(reservations);
        return reservations;
    }
}