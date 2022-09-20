package com.example.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class UserDto implements Validator {

    @NotBlank(message = "Không được để trống")
    @Size(min = 5,max = 45,message = "Độ dài tối thiểu 5, tối đa 45 ký tự")
    private String firstName;

    @NotBlank(message = "Không được để trống")
    @Size(min = 5,max = 45,message = "Độ dài tối thiểu 5, tối đa 45 ký tự")
    private String lastName;

    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "(^$|[0-9]*$)",message = "Bắt đầu bằng số 0")
    private String phoneNumber;

    @NotBlank(message = "Không được để trống")
    @Min( value = 18,message = "Người dùng phải trên 18+")
    private String age;

    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^[a-z]+([\\_\\.]?[a-z\\d]+)*@[a-z]{3,7}\\.[a-z]{2,3}$",message = "Sai quy tắc đặt tên Email")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDto() {
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        String phone = userDto.phoneNumber;
        if(phone.length() >11 || phone.length() <=10){
            errors.rejectValue("phoneNumber","","Độ dài từ 10 đến 11 số");
        }
    }
}
