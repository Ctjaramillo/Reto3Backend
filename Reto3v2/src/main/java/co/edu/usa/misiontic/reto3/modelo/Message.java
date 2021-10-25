/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Carotobarj
 */
@Data
@Entity
@Table(name="MESSAGE")
public class Message implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;
    
    //Relación Room-Message
    @ManyToOne
    @JoinColumn(name="roomId")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Room room;
    
    //Relación Client-Message
    @ManyToOne
    @JoinColumn(name="clientId")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;
    
    
}
