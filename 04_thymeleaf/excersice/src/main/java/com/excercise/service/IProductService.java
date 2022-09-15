package com.excercise.service;

import com.excercise.model.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {

    List<Product> findAll();

    void save(Product product);

    void update(Product product);

    Product findById(int id);

    void delete(int id);

    List<Product> findByName(String name);
}
