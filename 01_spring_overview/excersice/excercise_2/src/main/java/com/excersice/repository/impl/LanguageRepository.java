package com.excersice.repository.impl;

import com.excersice.model.Language;
import com.excersice.repository.ILanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class LanguageRepository implements ILanguageRepository {
    private static List<Language> languageList;

    static {
        languageList = new ArrayList<>();
        languageList.add(new Language("Oto", "Car"));
        languageList.add(new Language("Xe đạp", "Bike"));
        languageList.add(new Language("Ngôi nhà", "House"));
        languageList.add(new Language("Con lợn", "Pig"));
        languageList.add(new Language("Máy tính", "Computer"));
    }


    @Override
    public String findByName(String keyword) {
        for (Language language : languageList) {
            if (keyword.toLowerCase().equals(language.getEnglish().toLowerCase(Locale.ROOT))) {
                return language.getVietnamese();
            }
        }
        return "Không tìm thấy từ đó!!";
    }
}
