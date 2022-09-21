package com.example.service;

import com.example.dto.BlogDto;
import com.example.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    Page<Blog> findAll(Pageable pageable);

    void save(Blog blog);

    void update(Blog blog);

    Blog findById(int id);

    void delete(int id);

    Page<Blog> searchByName(String name, Pageable pageable);

    List<BlogDto> findAllBlogDto();

}
