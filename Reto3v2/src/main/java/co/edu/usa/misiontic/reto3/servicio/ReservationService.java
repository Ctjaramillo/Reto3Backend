/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.servicio;


import co.edu.usa.misiontic.reto3.modelo.Reservation;
import co.edu.usa.misiontic.reto3.repository.ReservationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carotobarj
 */
@Service
public class ReservationService {
    
    @Autowired
    private ReservationRepository reservationRepository;
    
    public List<Reservation> getAll(){
        return reservationRepository.getAll();
    }
    
    public Optional<Reservation> getReservation(Integer id){
        return reservationRepository.getReservation(id);
    }
    
    public Reservation save(Reservation reservation){
        if(reservation.getIdReservation() == null){
            return reservationRepository.save(reservation);
        } else {
            Optional<Reservation> reservationAux = reservationRepository.getReservation(reservation.getIdReservation());
            if(reservationAux.isEmpty()){
                return reservationRepository.save(reservation);
            } else {
                return reservation;
            }
        }
    }
}