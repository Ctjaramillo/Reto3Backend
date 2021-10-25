/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.controller;


import co.edu.usa.misiontic.reto3.modelo.Admin;
import co.edu.usa.misiontic.reto3.servicio.AdminService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Carotobarj
 */
@RestController
@RequestMapping("/api/Admin")
@CrossOrigin(origins="*", methods={RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class AdminController {
    
    @Autowired
    private AdminService adminService;
    
    @GetMapping("/all")
    public List<Admin> getAdmin(){
        return adminService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Admin> getAll(@PathVariable Integer id){
        return adminService.getAdmin(id);
    }
    
    @PostMapping("/save")
    public Admin save(Admin admin){
        return adminService.save(admin);
    }
    
}