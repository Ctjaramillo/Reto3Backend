/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Carotobarj
 */
@Entity
@Table(name = "room")
@Data
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String name;

    //Relación tabla Category y tabla Room
    
    @ManyToOne
    @JoinColumn(name = "category")
    @JsonIgnoreProperties("rooms")
    private Category category;

    //Relación tabla Room y tabla Messages
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "room")
    @JsonIgnoreProperties({"room", "client"})
    private List<Message> messages;

    //Relación tabla Room y tabla Reservations
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "room")
    @JsonIgnoreProperties({"room", "client"})
    private List<Reservation> reservations;
}
