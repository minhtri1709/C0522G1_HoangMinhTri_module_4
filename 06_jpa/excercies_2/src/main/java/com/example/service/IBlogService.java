package com.example.service;

import com.example.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    void save(Blog product);

    void update(Blog product);

    Blog findById(int id);

    void delete(int id);

}
