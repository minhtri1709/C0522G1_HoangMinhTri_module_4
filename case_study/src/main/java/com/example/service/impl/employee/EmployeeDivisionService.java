package com.example.service.impl.employee;

import com.example.model.employee.Division;
import com.example.repository.employee.IEmployeeDivision;
import com.example.service.employee.IEmployeeDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDivisionService implements IEmployeeDivisionService {
    @Autowired
    private IEmployeeDivision iEmployeeDivision;


    @Override
    public List<Division> findAll() {
        return iEmployeeDivision.findAll();
    }
}
