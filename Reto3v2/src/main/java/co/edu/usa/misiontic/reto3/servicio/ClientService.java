/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.servicio;

import co.edu.usa.misiontic.reto3.modelo.Client;
import co.edu.usa.misiontic.reto3.repository.ClientRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author caro_
 */
@Service
public class ClientService {
    
    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    
    public Optional<Client> getClient(Integer id){
        return clientRepository.getClient(id);
    }
    
    public Client save(Client client){
        if(client.getIdClient()== null){
            return clientRepository.save(client);
        } else {
            Optional<Client> clientAux = clientRepository.getClient(client.getIdClient());
            if(clientAux.isEmpty()){
                return clientRepository.save(client);
            } else {
                return client;
            }
        }
    }
}