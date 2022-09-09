package com.excersice.service;

import com.excersice.model.Language;

import java.util.List;

public interface ILanguageService {
    public List<Language> findByName(String keyword);
}
