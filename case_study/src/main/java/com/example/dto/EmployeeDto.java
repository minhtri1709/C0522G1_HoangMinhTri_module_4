package com.example.dto;

import com.example.model.employee.Division;
import com.example.model.employee.EducationDegree;
import com.example.model.employee.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDto {
    private int id;

    private String name;

    private String dateOfBirth;

    private String idCard;

    private int salary;

    private String phoneNumber;

    private String email;

    private String address;

    private String userName;

    private int isDelete;

    private Position position;

    private EducationDegree educationDegree;

    private Division division;

    public EmployeeDto() {
    }

    public EmployeeDto(int id, String name, String dateOfBirth, String idCard, int salary, String phoneNumber,
                       String email, String address, String userName, int isDelete, Position position, EducationDegree educationDegree, Division division) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.userName = userName;
        this.isDelete = isDelete;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
    }
}
