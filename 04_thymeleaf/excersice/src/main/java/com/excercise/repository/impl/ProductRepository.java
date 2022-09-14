package com.excercise.repository.impl;

import com.excercise.model.Product;
import com.excercise.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "Áo", 1000, "Áo tay dài", "Việt Tiến"));
        productMap.put(2, new Product(2, "Quần", 500, "Quần jeans", "Việt Tiến"));
        productMap.put(3, new Product(3, "Áo", 1500, "Áo mưa", "Durex"));
        productMap.put(4, new Product(4, "Áo", 1000, "Áo tay dài", "Việt Tiến"));
        productMap.put(5, new Product(5, "Áo", 1000, "Áo tay dài", "Việt Tiến"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> findByName(String name) {
        Set<Map.Entry<Integer, Product>> temp = productMap.entrySet();
        List<Product> newProduct = new ArrayList<>();

        for (Map.Entry<Integer, Product> search : temp) {
            if ((search.getValue().getName()).contains(name)) {
                newProduct.add(search.getValue());
            }
        }
        return newProduct;
    }
}
