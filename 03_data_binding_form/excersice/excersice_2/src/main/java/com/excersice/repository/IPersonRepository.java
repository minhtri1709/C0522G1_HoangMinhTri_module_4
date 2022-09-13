package com.excersice.repository;

import com.excersice.model.Person;

import java.util.List;

public interface IPersonRepository {
    List<Person> findAll();

    List<String> genderList();

    List<String> dayOfBeginList();

    List<String> monthOfBeginList();

    List<String> yearOfBeginList();

    List<String> dayOfEndList();

    List<String> monthOfEndList();

    List<String> yearOfEndList();

    List<String> yearOfBirthList();

    List<String> nationalityList();

    List<String> vehicleList();

    Person findById(int id);

    void update(int id, Person person);


}
