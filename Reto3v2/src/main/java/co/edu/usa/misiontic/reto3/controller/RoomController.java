/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.controller;


import co.edu.usa.misiontic.reto3.modelo.Room;
import co.edu.usa.misiontic.reto3.servicio.RoomService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carotobarj
 */
@RestController //Recibe las peticiones
@RequestMapping("/api/Room") //URL de la petición
@CrossOrigin(origins="*", methods={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
//Para evitar el error CORS, permite la ejecución de las peticiones
public class RoomController {
    
    @Autowired
    private RoomService roomService;
    
    @GetMapping("/all") //Solo se ejecuta en una petición GET
    public List<Room> getRoom(){
        return roomService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Room> getRoom(@PathVariable("id") Integer id){ //Toma una variable de la dirección
        return roomService.getRoom(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Room save(@RequestBody Room room){ //RequestBody agrega la petición(JSON)
        return roomService.save(room);
    }
    
}