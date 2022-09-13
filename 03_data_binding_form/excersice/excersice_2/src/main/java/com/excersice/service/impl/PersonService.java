package com.excersice.service.impl;

import com.excersice.model.Person;
import com.excersice.service.IPersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {
    private static IPersonService iPersonService;


    @Override
    public List<Person> findAll() {
        return iPersonService.findAll();
    }

    @Override
    public List<String> genderList() {
        return iPersonService.genderList();
    }

    @Override
    public List<String> dayOfBeginList() {
        return iPersonService.dayOfBeginList();
    }

    @Override
    public List<String> monthOfBeginList() {
        return iPersonService.monthOfBeginList();
    }

    @Override
    public List<String> yearOfBeginList() {
        return iPersonService.yearOfBeginList();
    }

    @Override
    public List<String> dayOfEndList() {
        return iPersonService.dayOfEndList();
    }

    @Override
    public List<String> monthOfEndList() {
        return iPersonService.monthOfEndList();
    }

    @Override
    public List<String> yearOfEndList() {
        return iPersonService.yearOfEndList();
    }

    @Override
    public List<String> yearOfBirthList() {
        return iPersonService.yearOfBirthList();
    }

    @Override
    public List<String> nationalityList() {
        return iPersonService.nationalityList();
    }

    @Override
    public List<String> vehicleList() {
        return iPersonService.vehicleList();
    }

    @Override
    public Person findById(int id) {
        return iPersonService.findById(id);
    }

    @Override
    public void update(int id, Person person) {
        iPersonService.update(id,person);
    }
}
