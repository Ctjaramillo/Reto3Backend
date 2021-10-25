/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.repository;


import co.edu.usa.misiontic.reto3.crud.RoomCrudRepository;
import co.edu.usa.misiontic.reto3.modelo.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carotobarj
 */
@Repository
public class RoomRepository {
    
    @Autowired
    private RoomCrudRepository roomCrudRepository;
    
    public List<Room> getAll(){
        return (List<Room>) roomCrudRepository.findAll();
    }
    
    public Optional<Room> getRoom(Integer id){
        return roomCrudRepository.findById(id);
    }
    
    public Room save(Room room){
        return roomCrudRepository.save(room);
    }
}
