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
    public void delete(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public void save(Blog product) {
        iBlogRepository.save(product);
    }

    @Override
    public void update(Blog product) {
        iBlogRepository.save(product);
    }

    @Override
    public Blog findById(int id) {
        return iBlogRepository.searchById(id);
    }

}
