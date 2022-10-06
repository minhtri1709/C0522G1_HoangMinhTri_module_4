package com.example.repository.employee;

import com.example.model.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeEducationDegree extends JpaRepository<EducationDegree, Integer> {
}
