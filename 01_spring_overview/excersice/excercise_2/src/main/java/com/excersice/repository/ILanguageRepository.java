package com.excersice.repository;

import com.excersice.model.Language;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ILanguageRepository {
    public List<Language> findByName(String keyword);
}
