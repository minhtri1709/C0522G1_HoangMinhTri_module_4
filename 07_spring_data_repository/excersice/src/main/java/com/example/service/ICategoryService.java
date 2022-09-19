package com.example.service;

import com.example.model.Category;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    void save(Category category);

    void delete(Category category);

    Category searchById(int id);

    void update(Category category);
}
