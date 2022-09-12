package com.excercise.controller;

import com.excercise.service.ICalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculationController {

    @Autowired
    private ICalculationService iCalculationService;

    @RequestMapping(value = {"","/  display"})
    public ModelAndView exchange() {
       return new ModelAndView("/display");
    }

    @RequestMapping("calculate")
    public ModelAndView display(@RequestParam double money){
        return new ModelAndView("/display","result",iCalculationService.exchange(money));
    }

}
