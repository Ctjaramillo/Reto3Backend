/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.crud;


import co.edu.usa.misiontic.reto3.modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Carotobarj
 */
public interface MessageCrudRepository extends CrudRepository<Message, Integer>{
    
}