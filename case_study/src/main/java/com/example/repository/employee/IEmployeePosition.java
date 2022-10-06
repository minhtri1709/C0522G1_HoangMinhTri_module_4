package com.example.repository.employee;

import com.example.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeePosition extends JpaRepository<Position, Integer> {
}
