package com.excersice.repository;

import com.excersice.model.Person;

import java.util.List;

public interface IPersonRepository {
    List<Person> findAll();

    List<String> genderList();

    List<String> getDayList();

    List<String> getMonthList();

    List<String> getYearList();

    List<String> nationalityList();

    List<String> vehicleList();

    Person findById(int id);

    void update(int id, Person person);


}
