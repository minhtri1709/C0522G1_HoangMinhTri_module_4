package com.example.repository;

import com.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from Product where name like %:keyword%",nativeQuery = true)
    List<Product> searchByName(@Param("keyword") String name);

    @Query(value = "select * from Product where id = :idSearch",nativeQuery = true)
    Product searchById(@Param("idSearch")int id);

}
