package com.excersice.service.impl;

import com.excersice.model.Person;
import com.excersice.repository.IPersonRepository;
import com.excersice.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private static IPersonRepository iPersonRepository;


    @Override
    public List<Person> findAll() {
        return iPersonRepository.findAll();
    }

    @Override
    public List<String> genderList() {
        return iPersonRepository.genderList();
    }

    @Override
    public List<String> dayOfBeginList() {
        return iPersonRepository.getDayList();
    }

    @Override
    public List<String> monthOfBeginList() {
        return iPersonRepository.getMonthList();
    }

    @Override
    public List<String> yearOfBeginList() {
        return iPersonRepository.yearOfBeginList();
    }

    @Override
    public List<String> dayOfEndList() {
        return iPersonRepository.dayOfEndList();
    }

    @Override
    public List<String> monthOfEndList() {
        return iPersonRepository.monthOfEndList();
    }

    @Override
    public List<String> yearOfEndList() {
        return iPersonRepository.yearOfEndList();
    }

    @Override
    public List<String> getYearOfBirth() {
        return iPersonRepository.getYearOfBirth();
    }

    @Override
    public List<String> nationalityList() {
        return iPersonRepository.nationalityList();
    }

    @Override
    public List<String> vehicleList() {
        return iPersonRepository.vehicleList();
    }

    @Override
    public Person findById(int id) {
        return iPersonRepository.findById(id);
    }

    @Override
    public void update(int id, Person person) {
        iPersonRepository.update(id,person);
    }
}
