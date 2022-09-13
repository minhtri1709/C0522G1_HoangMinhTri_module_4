package com.excersice.service.impl;

import com.excersice.model.Language;
import com.excersice.repository.ILanguageRepository;
import com.excersice.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService implements ILanguageService {

    @Autowired
    private ILanguageRepository iLanguageRepository;


    @Override
    public String findByName(String keyword) {
        return iLanguageRepository.findByName(keyword);
    }
}
