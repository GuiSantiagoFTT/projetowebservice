package com.gui.projetowebservice.services;

import com.gui.projetowebservice.entities.Category;
import com.gui.projetowebservice.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository CategoryRepository;

    public List<Category> findAll(){
        return CategoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> Category = CategoryRepository.findById(id);
        return  Category.get();
    }
}
