package com.example.model.customer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String dateOfBirth;

    private int gender;

    private String idCard;

    private String phoneNumber;

    private String email;

    private String address;

    private int isDelete;

    @ManyToOne
    @JoinColumn(name = "customer_type_id",referencedColumnName = "id")
    private CustomerType customerType;


    public Customer() {
    }

    public Customer(int id, String name, String dateOfBirth,
                    int gender, String idCard, String phoneNumber, String email, String address, int isDelete) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.isDelete = isDelete;
    }
}
