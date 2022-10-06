package com.example.service.employee;

import com.example.model.customer.Customer;
import com.example.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);

    void save(Employee employee);

    void delete(int id);

    void update(Employee employee);

    Optional<Employee> findById(int id);
}
