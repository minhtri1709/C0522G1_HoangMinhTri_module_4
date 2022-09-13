package com.excersice.controller;

import com.excersice.model.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {

    @GetMapping()
    public String getIndex(Model model) {

        List<String> languageList = new ArrayList<>();
        languageList.add("English");
        languageList.add("Vietnamese");
        languageList.add("Japanese");
        languageList.add("Chinese");

        List<Integer> pageSizeList = new ArrayList<>();
        pageSizeList.add(5);
        pageSizeList.add(10);
        pageSizeList.add(15);
        pageSizeList.add(25);
        pageSizeList.add(50);
        pageSizeList.add(100);

        model.addAttribute("pageSizeList",pageSizeList);
        model.addAttribute("languageList",languageList);
        model.addAttribute("email", new Email());

        return "index";
    }


    @PostMapping("/create")
    public String submit(@ModelAttribute Email email, Model model) {

        model.addAttribute("language", email.getLanguage());
        model.addAttribute("pageSize", email.getPageSize());

        if (email.getSpamFilter() == null) {

            model.addAttribute("spamFilter", "No");
        } else {
            model.addAttribute("spamFilter", email.getSpamFilter());
        }

        if (email.getSignature() == null) {

            model.addAttribute("singnature", "No signature from email!! ");
        } else {
            model.addAttribute("singnature", email.getSignature());
        }

        return "info";
    }
}
