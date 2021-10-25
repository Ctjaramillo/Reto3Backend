/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.repository;

import co.edu.usa.misiontic.reto3.crud.AdminCrudRepository;
import co.edu.usa.misiontic.reto3.modelo.Admin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Carotobarj
 */
@Repository
public class AdminRepository {
    
    @Autowired
    private AdminCrudRepository adminCrudRepository;
    
    public List<Admin> getAll(){
        return (List<Admin>) adminCrudRepository.findAll();
    }
    
    public Optional<Admin> getAdmin(Integer id){
        return adminCrudRepository.findById(id);
    }
    
    public Admin save(Admin admin){
        return adminCrudRepository.save(admin);
    }
}
