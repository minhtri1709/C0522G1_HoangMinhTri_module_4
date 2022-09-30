package com.example.service.impl;

import com.example.model.User;
import com.example.repository.IUserRepository;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService implements IUserService {
    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public List<User> findAll() {
        return iUserRepository.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return iUserRepository.findById(id);
    }
}
