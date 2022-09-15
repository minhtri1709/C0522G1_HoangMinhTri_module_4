package com.excercise.repository;

import com.excercise.model.Product;

import java.util.List;


public interface IProductRepository {

    List<Product> findAll();

    void save(Product product);

    void update(Product product);

    Product findById(int id);

    void delete(int id);

    List<Product> findByName(String name);

}
