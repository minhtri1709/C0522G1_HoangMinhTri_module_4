package com.excersice.controller;

import com.excersice.model.Person;
import com.excersice.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    IPersonService iPersonService;

    @GetMapping()
    public String getIndex(Model model) {
        model.addAttribute("person" , new Person());
        return "index";
    }


    @GetMapping("/list")
    public String getList(Model model){
        List<Person> personList = iPersonService.findAll();
        model.addAttribute("person",personList);
        return "list";
    }


    @GetMapping("/edit")
    public ModelAndView showFormEdit(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("index");
        Person person = iPersonService.findById(id);
        modelAndView.addObject("person",person);
        modelAndView.addObject("birthdayList",iPersonService.yearOfBirthList());
        modelAndView.addObject("genderList",iPersonService.genderList());
        modelAndView.addObject("countryList",iPersonService.nationalityList());
        modelAndView.addObject("renderList",iPersonService.vehicleList());
        modelAndView.addObject("starDayList",iPersonService.dayOfBeginList());
        modelAndView.addObject("starMonthList",iPersonService.monthOfBeginList());
        modelAndView.addObject("starYearList",iPersonService.yearOfBeginList());
        modelAndView.addObject("endDayList",iPersonService.dayOfEndList());
        modelAndView.addObject("endMonthList",iPersonService.monthOfEndList());
        modelAndView.addObject("endYearList",iPersonService.yearOfEndList());
        return modelAndView;
    }

//    @PostMapping("/save")
//    public String save(@ModelAttribute Person person){
//        iPersonService.update(person);
//    }

}
