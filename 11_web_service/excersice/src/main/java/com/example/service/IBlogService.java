package com.example.service;

import com.example.model.Blog;

import java.util.List;

public interface IBlogService {

    List<Blog> findAll();

    List<Blog> findByCategory(int id);

    Blog searchById(int id);

    Blog searchByName(String name);
}
