package com.excersice.controller;

import com.excersice.model.Person;
import com.excersice.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private IPersonService iPersonService;

    @GetMapping()
    public String getIndex(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("birthdayList", iPersonService.getYearOfBirth());
        model.addAttribute("genderList", iPersonService.genderList());
        model.addAttribute("countryList", iPersonService.nationalityList());
        model.addAttribute("renderList", iPersonService.vehicleList());
        model.addAttribute("starDayList", iPersonService.dayOfBeginList());
        model.addAttribute("starMonthList", iPersonService.monthOfBeginList());
        model.addAttribute("starYearList", iPersonService.yearOfBeginList());
        model.addAttribute("endMonthList", iPersonService.monthOfEndList());
        model.addAttribute("endYearList", iPersonService.yearOfEndList());
        return "index";
    }


    @GetMapping("/list")
    public String getList(Model model) {
        List<Person> personList = iPersonService.findAll();
        model.addAttribute("person", personList);
        return "list";
    }


    @GetMapping("/edit")
    public ModelAndView showFormEdit(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("index");
        Person person = iPersonService.findById(id);
        modelAndView.addObject("person", person);
        modelAndView.addObject("birthdayList", iPersonService.getYearOfBirth());
        modelAndView.addObject("genderList", iPersonService.genderList());
        modelAndView.addObject("countryList", iPersonService.nationalityList());
        modelAndView.addObject("renderList", iPersonService.vehicleList());
        modelAndView.addObject("starDayList", iPersonService.dayOfBeginList());
        modelAndView.addObject("starMonthList", iPersonService.monthOfBeginList());
        modelAndView.addObject("starYearList", iPersonService.yearOfBeginList());
        modelAndView.addObject("endDayList", iPersonService.dayOfEndList());
        modelAndView.addObject("endMonthList", iPersonService.monthOfEndList());
        modelAndView.addObject("endYearList", iPersonService.yearOfEndList());
        return modelAndView;
    }

//    @PostMapping("/save")
//    public String save(@ModelAttribute Person person){
//        iPersonService.update(person);
//    }

}
