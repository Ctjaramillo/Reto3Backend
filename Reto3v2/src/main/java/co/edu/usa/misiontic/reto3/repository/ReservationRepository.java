/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.repository;


import co.edu.usa.misiontic.reto3.crud.ReservationCrudRepository;
import co.edu.usa.misiontic.reto3.modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carotobarj
 */
@Repository
public class ReservationRepository {
    
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;
    
    public List<Reservation> getAll(){
        return (List<Reservation>) reservationCrudRepository.findAll();
    }
    
    public Optional<Reservation> getReservation(Integer id){
        return reservationCrudRepository.findById(id);
    }
    
    public Reservation save(Reservation reservation){
        return reservationCrudRepository.save(reservation);
    }
}
