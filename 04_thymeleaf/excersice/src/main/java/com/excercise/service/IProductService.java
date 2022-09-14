package com.excercise.service;

import com.excercise.model.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {

    List<Product> findAll();

    void delete(int id);

    void save(Product product);

    void update(int id, Product product);

    Product findById(int id);

    List<Product> findByName(String name);
}
