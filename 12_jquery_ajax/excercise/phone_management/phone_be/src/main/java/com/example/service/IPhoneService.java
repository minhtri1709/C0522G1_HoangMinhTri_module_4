package com.example.service;

import com.example.model.Phone;

import java.util.Optional;

public interface IPhoneService {
    Iterable<Phone> findAll();

    Optional<Phone> findById(int id);

    Phone save(Phone smartPhone);

    void remove(int id);
}
