/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usa.misiontic.reto3.servicio;


import co.edu.usa.misiontic.reto3.modelo.Category;
import co.edu.usa.misiontic.reto3.repository.CategoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Carotobarj
 */
@Service

public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();

    }

    public Optional<Category> getCategory(Integer Id) {
        return categoryRepository.getCategory(Id);
    }

    public Category save(Category category) {
        if (category.getId() == null) {
            return categoryRepository.save(category);
        } else {
            Optional<Category> categoriaAux = categoryRepository.getCategory(category.getId());
            if (categoriaAux.isEmpty()) {
                return categoryRepository.save(category);
            } else {
                return category;
            }
        }
    }
}
