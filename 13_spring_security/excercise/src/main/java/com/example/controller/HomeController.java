package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/page")
    public String getPage(){
        return "page";
    }

    @GetMapping("/abc")
    public String getLogIn(){
        return "myLogin";
    }

//    @PostMapping("/abc")
//    public String getHomePage(){
//        return "page";
//    }

    @GetMapping("/blog")
    public String getBlog(){
        return "blog";
    }
}
