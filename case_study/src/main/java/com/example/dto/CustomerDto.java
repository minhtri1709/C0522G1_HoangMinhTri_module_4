package com.example.dto;

import com.example.model.contract.Contract;
import com.example.model.customer.CustomerType;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class CustomerDto {
    private int id;

    private String name;

    private String dateOfBirth;

    private int gender;

    private String idCard;

    private String phoneNumber;

    private String email;

    private String address;

    private int isDelete;

    private CustomerType customerType;

    private Set<Contract> contractSet;

    public CustomerDto() {
    }
}
