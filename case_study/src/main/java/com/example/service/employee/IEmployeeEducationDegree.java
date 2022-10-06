package com.example.service.employee;

import com.example.model.employee.Division;
import com.example.model.employee.EducationDegree;

import java.util.List;

public interface IEmployeeEducationDegree {
    List<EducationDegree> findAll();
}
