/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.servicio;


import co.edu.usa.misiontic.reto3.modelo.Room;
import co.edu.usa.misiontic.reto3.repository.RoomRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carotobarj
 */
@Service
public class RoomService {
    
    @Autowired
    private RoomRepository roomRepository;
    
    public List<Room> getAll(){
        return roomRepository.getAll();
    }
    
    public Optional<Room> getRoom(Integer id){
        return roomRepository.getRoom(id);
    }
    
    public Room save(Room room){
        if(room.getId() == null){
            return roomRepository.save(room);
        } else {
            Optional<Room> roomAux = roomRepository.getRoom(room.getId());
            if(roomAux.isEmpty()){
                return roomRepository.save(room);
            } else {
                return room; //Lo retorna pero no lo guarda
            }
        }
    }
}
