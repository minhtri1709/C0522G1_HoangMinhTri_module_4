package com.example.dto;

import com.example.model.contract.Contract;
import com.example.model.customer.CustomerType;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Set;

@Setter
@Getter
public class CustomerDto {
    private int id;

    @NotBlank(message = "Can not be blank!")
    @Pattern(regexp = "^(([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5})| *$",
            message = "The name must be in the correct format, cannot contain numbers and special characters!")
    private String name;

    @Pattern(regexp = "(19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[0-1])$",
            message = "The Day Of Birth must be in the correct format: MM-DD-YYYY")
    private String dateOfBirth;


    private int gender;

    @NotBlank(message = "Can not be blank!")
    @Pattern(regexp = "^(\\d{9}|\\d{12})| *$",
            message = "The id must be in the correct format XXXXXXXXX or XXXXXXXXXXXX (X is number 0-9).")
    private String idCard;

    @NotBlank(message = "Can not be blank")
    @Pattern(regexp = "^(((\\(\\+84\\-\\))|0)(90|91)[0-9]{7})| *$",
            message = "The number phone must be in the correct format 090xxxxxxx or 091xxxxxxx hoặc (84)+90xxxxxxx or (84)+91xxxxxxx.")
    private String phoneNumber;

    @NotBlank(message = "Can not be blank")
    @Email(message = "The email must be in the correct format")
    private String email;

    @NotBlank(message = "Can not be blank!")
    private String address;

    private int isDelete;

    private CustomerType customerType;

    private Set<Contract> contractSet;

    public CustomerDto() {
    }
}
