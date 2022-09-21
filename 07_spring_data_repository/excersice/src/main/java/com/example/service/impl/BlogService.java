package com.example.service.impl;

import com.example.dto.BlogDto;
import com.example.model.Blog;
import com.example.repository.IBlogRepository;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {

    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return iBlogRepository.findAll(pageable);
    }

    @Override
    public void delete(int id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> searchByName(String name, Pageable pageable) {
        return iBlogRepository.searchByName(name, pageable);
    }

    @Override
    public List<BlogDto> findAllBlogDto() {
        return iBlogRepository.findAllBlogDto();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
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
