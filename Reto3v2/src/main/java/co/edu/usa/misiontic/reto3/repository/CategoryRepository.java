/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.repository;


import co.edu.usa.misiontic.reto3.crud.CategoryCrudRepository;
import co.edu.usa.misiontic.reto3.modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Carotobarj
 */
@Repository

public class CategoryRepository {

    @Autowired

    private CategoryCrudRepository categoriaCrudRepository;

    public List<Category> getAll() {
        return (List<Category>) categoriaCrudRepository.findAll();

    }

    public Optional<Category> getCategory(Integer Id) {
        return categoriaCrudRepository.findById(Id);
    }

    public Category save(Category categoria) {
        return categoriaCrudRepository.save(categoria);
    }
}
