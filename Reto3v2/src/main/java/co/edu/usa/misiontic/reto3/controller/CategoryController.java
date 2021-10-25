/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.controller;

import co.edu.usa.misiontic.reto3.modelo.Category;
import co.edu.usa.misiontic.reto3.servicio.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Carotobarj
 */
@RestController
@RequestMapping("/api/Category/")
public class CategoryController {
   
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/all")
        public List<Category> getAll(){
        return categoryService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") Integer id){
        return categoryService.getCategory(id);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }
}
