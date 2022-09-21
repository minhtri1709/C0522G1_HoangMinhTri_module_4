package com.example.repository;

import com.example.dto.BlogDto;
import com.example.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IBlogRepository extends JpaRepository<Blog, Integer> {


    @Query(value = "select * from Blog where id = :idSearch", nativeQuery = true)
    Blog searchById(@Param("idSearch") int id);

    @Query(value = "select * from Blog where name like %:nameSearch%", nativeQuery = true)
    Page<Blog> searchByName( @Param("nameSearch") String name, Pageable pageable);

    @Query(value = "select b.name as titleDto, c.name_category as categoryDto from blog b join category c on b.category_id = c.id",nativeQuery = true)
    List<BlogDto> findAllBlogDto();


}
