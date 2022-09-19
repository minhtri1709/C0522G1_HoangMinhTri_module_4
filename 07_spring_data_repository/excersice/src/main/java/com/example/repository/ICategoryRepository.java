package com.example.repository;

import com.example.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {

    @Query(value = "select * from Category where id= :idSearch",nativeQuery = true)
    Category searchById(@Param("idSearch") int id);
}
