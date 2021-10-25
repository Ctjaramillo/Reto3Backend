/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.repository;


import co.edu.usa.misiontic.reto3.crud.MessageCrudRepository;
import co.edu.usa.misiontic.reto3.modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carotobarj
 */
@Repository
public class MessageRepository {
    
    @Autowired
    private MessageCrudRepository messageCrudRepository;
    
    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }
    
    public Optional<Message> getMessage(Integer id){
        return messageCrudRepository.findById(id);
    }
    
    public Message save(Message message){
        return messageCrudRepository.save(message);
    }
}
