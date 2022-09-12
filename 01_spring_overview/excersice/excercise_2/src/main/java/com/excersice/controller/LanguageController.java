package com.excersice.controller;

import com.excersice.service.ILanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LanguageController {

    @Autowired
    private ILanguageService iLanguageService;

    @GetMapping("")
    public ModelAndView page() {
        return new ModelAndView("display");
    }

    @RequestMapping(value = "translate", method = RequestMethod.GET)
    public ModelAndView showList(@RequestParam String english) {

        return new ModelAndView("display", "vietnamese", iLanguageService.findByName_1(english));


    }
}
