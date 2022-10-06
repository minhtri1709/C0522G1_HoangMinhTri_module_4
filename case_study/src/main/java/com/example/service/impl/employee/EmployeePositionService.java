package com.example.service.impl.employee;

import com.example.model.employee.Position;
import com.example.repository.employee.IEmployeePosition;
import com.example.service.employee.IEmployeePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePositionService implements IEmployeePositionService {

    @Autowired
    private IEmployeePosition iEmployeePosition;

    @Override
    public List<Position> findAll() {
        return iEmployeePosition.findAll();
    }
}
