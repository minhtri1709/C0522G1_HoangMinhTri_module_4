package com.example.repository;

import com.example.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface IBlogRepository extends JpaRepository<Blog, Integer> {


    @Query(value = "select * from Blog where id = :idSearch", nativeQuery = true)
    Blog searchById(@Param("idSearch") int id);

}
