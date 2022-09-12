package com.excersice.controller;

import com.excersice.service.impl.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @GetMapping()
    public String index(){
        return "index";
    }


    @GetMapping("/calculate")
    public ModelAndView calculate(@RequestParam String numberFirst,String numberSecond, String operation){
        return new ModelAndView("index","result",calculatorService.result(numberFirst,numberSecond,operation));
    }
}
