package com.excersice.service;

import com.excersice.model.Language;
import com.excersice.repository.ILanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements ILanguageService{

    @Autowired
    private ILanguageRepository iLanguageRepository;

    @Override
    public List<Language> findByName(String keyword) {
        return iLanguageRepository.findByName(keyword);
    }
}
