package com.example.service.employee;

import com.example.model.employee.Division;
import com.example.model.employee.Position;

import java.util.List;

public interface IEmployeePositionService {
    List<Position> findAll();
}
