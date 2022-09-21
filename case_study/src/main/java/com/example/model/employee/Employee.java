package com.example.model.employee;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne
    @JoinColumn(name = "position_id" ,referencedColumnName = "id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id" ,referencedColumnName = "id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id" ,referencedColumnName = "id")
    private Division division;

    public Employee() {
    }

    public Employee(int id, String name, String dateOfBirth, String idCard, int salary
            , String phoneNumber, String email, String address, String userName, int isDelete) {
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
    }
}
