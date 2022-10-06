package com.example.controller;

import com.example.dto.EmployeeDto;
import com.example.model.employee.Employee;
import com.example.service.employee.IEmployeeDivisionService;
import com.example.service.employee.IEmployeeEducationDegree;
import com.example.service.employee.IEmployeePositionService;
import com.example.service.employee.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService iEmployeeService;

    @Autowired
    private IEmployeeEducationDegree employeeEducationDegree;

    @Autowired
    private IEmployeePositionService employeePositionService;

    @Autowired
    private IEmployeeDivisionService employeeDivisionService;


    @GetMapping
    public String getList(@PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("employeeList", iEmployeeService.findAll(pageable));
        model.addAttribute("employeeDto", new EmployeeDto());
        model.addAttribute("positionList", employeePositionService.findAll());
        model.addAttribute("divisionList", employeeDivisionService.findAll());
        model.addAttribute("educationDegreeList",employeeEducationDegree.findAll());
        return "employee/list";
    }

    @PostMapping("/save")
    public String getCreate(@ModelAttribute EmployeeDto employeeDto, Model model){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto,employee);
        iEmployeeService.save(employee);
        return "redirect:/employee";
    }
}
