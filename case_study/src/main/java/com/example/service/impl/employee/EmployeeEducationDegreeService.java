package com.example.service.impl.employee;

import com.example.model.employee.EducationDegree;
import com.example.repository.employee.IEmployeeEducationDegree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeEducationDegreeService implements com.example.service.employee.IEmployeeEducationDegree {
    @Autowired
    private IEmployeeEducationDegree iEmployeeEducationDegree;


    @Override
    public List<EducationDegree> findAll() {
        return iEmployeeEducationDegree.findAll();
    }
}
