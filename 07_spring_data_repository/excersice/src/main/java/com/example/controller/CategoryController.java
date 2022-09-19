package com.example.controller;

import com.example.model.Category;
import com.example.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService iCategoryService;

    @GetMapping("")
    public String getList(Model model) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categories", categoryList);
        return "/list_category";
    }

    @GetMapping("/{id}/edit")
    public String getEditForm(@PathVariable int id, Model model) {
        model.addAttribute("category", iCategoryService.searchById(id));
        return "/edit_category";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        iCategoryService.save(category);
        return "redirect:/category";
    }


    @GetMapping("/delete/{id}")
    private String delete(@PathVariable int id, Model model) {
        model.addAttribute("category", iCategoryService.searchById(id));
        return "/delete_category";
    }

    @PostMapping("/delete")
    public String delete(Category category) {
        iCategoryService.delete(category);
        return "redirect:/category";
    }

    @GetMapping("/add")
    public String create(Model model) {
        model.addAttribute("category", new Category());
        return "/create_category";
    }

    @PostMapping("/save")
    public String save(Category category) {
        iCategoryService.save(category);
        return "redirect:/category";
    }
}
