package com.example.service.customer;

import com.example.model.customer.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    void delete(Customer customer);

    void update(Customer customer);

    Optional<Customer> findById(int id);
}
