package com.excersice.repository;

import com.excersice.model.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageRepositoryImpl implements ILanguageRepository{
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
    public List<Language> findByName(String keyword) {
         List<Language> result = new ArrayList<>();

        for (Language word:languageList) {
            if(word.getEnglish().contains(keyword)){
                result.add(word);
            }
        }
        return result;
    }
}
