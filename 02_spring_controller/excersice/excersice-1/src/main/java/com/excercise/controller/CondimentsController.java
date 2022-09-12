package com.excercise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CondimentsController {

    @RequestMapping(value = {"", "/default"})
    public String getPage() {
        return "index";
    }

    @RequestMapping("/save")
    public String save(Model model, @RequestParam(value = "condiment",required = false) String[] condiment) {

        model.addAttribute("condiment",condiment);

        return "index";
    }

}
