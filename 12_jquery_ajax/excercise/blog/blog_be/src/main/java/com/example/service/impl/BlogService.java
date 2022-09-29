package com.example.service.impl;

import com.example.model.Blog;
import com.example.repository.IBlogRepository;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public List<Blog> findByCategory(int id) {
        return iBlogRepository.showListCategory(id);
    }

    @Override
    public Blog searchById(int id) {
        return iBlogRepository.searchById(id);
    }

    @Override
    public List<Blog> searchByName(String name) {
        return iBlogRepository.searchByName(name);
    }

}
