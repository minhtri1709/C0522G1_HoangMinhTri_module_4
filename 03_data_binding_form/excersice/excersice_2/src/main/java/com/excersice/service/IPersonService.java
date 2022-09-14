package com.excersice.service;

import com.excersice.model.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findAll();

    List<String> genderList();

    List<String> dayOfBeginList();

    List<String> monthOfBeginList();

    List<String> yearOfBeginList();

    List<String> dayOfEndList();

    List<String> monthOfEndList();

    List<String> yearOfEndList();

    List<String> getYearOfBirth();

    List<String> nationalityList();

    List<String> vehicleList();

    Person findById(int id);

    void update(int id, Person person);
}
