package com.example.service.impl;

import com.example.model.Phone;
import com.example.repository.IPhoneRepository;
import com.example.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PhoneService implements IPhoneService {

    @Autowired
    private IPhoneRepository iPhoneRepository;


    @Override
    public Iterable<Phone> findAll() {
        return iPhoneRepository.findAll();
    }

    @Override
    public Optional<Phone> findById(int id) {
        return iPhoneRepository.findById(id);
    }

    @Override
    public Phone save(Phone smartPhone) {
        return iPhoneRepository.save(smartPhone);
    }

    @Override
    public void remove(int id) {
        iPhoneRepository.deleteById(id);
    }
}
