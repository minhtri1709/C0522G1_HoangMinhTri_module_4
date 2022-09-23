package com.example.controller;

import com.example.dto.CategoryDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cart")
public class CategoryController {
    @GetMapping
    public ModelAndView getCart(@SessionAttribute(name = "cart",required = false)CategoryDto categoryDto){
        return new ModelAndView("category","cart",categoryDto);
    }
}
