package com.example.repository.employee;

import com.example.model.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeDivision extends JpaRepository<Division, Integer> {
}
