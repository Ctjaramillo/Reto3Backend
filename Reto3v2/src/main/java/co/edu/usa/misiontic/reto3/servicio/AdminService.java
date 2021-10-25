/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.servicio;


import co.edu.usa.misiontic.reto3.modelo.Admin;
import co.edu.usa.misiontic.reto3.repository.AdminRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carotobarj
 */
@Service
public class AdminService {
    
    @Autowired
    private AdminRepository adminRepository;
    
    public List<Admin> getAll(){
        return adminRepository.getAll();
    }
    
    public Optional<Admin> getAdmin(Integer id){
        return adminRepository.getAdmin(id);
    }
    
    public Admin save(Admin admin){
        if(admin.getIdAdmin() == null){
            return adminRepository.save(admin);
        } else {
            Optional<Admin> adminAux = adminRepository.getAdmin(admin.getIdAdmin());
            if(adminAux.isEmpty()){
                return adminRepository.save(admin);
            } else {
                return admin;
            }
        }
    }
    
}
