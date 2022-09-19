package com.example.controller;

import com.example.model.Blog;
import com.example.model.Category;
import com.example.service.IBlogService;
import com.example.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("blog/")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;


    @GetMapping("/list")
    public String getList(@PageableDefault(value = 2, sort = "dateCreated") Pageable pageable, Model model) {
        Page<Blog>blogList = iBlogService.findAll(pageable);
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("blogs", blogList);
        model.addAttribute("categories", categoryList);
        return "list";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("blogs", new Blog());
        List<Category> categories = iCategoryService.findAll();
        model.addAttribute("categoryList",categories);
        return "create";
    }

    @PostMapping("save")
    public String save(Blog blog, RedirectAttributes redirect) {
        iBlogService.save(blog);
        redirect.addFlashAttribute("mess", "Success");
        return "redirect:/blog/list";
    }

    @GetMapping("{id}/edit")
    public String getEdit(@PathVariable int id, Model model) {
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categories",categoryList);
        model.addAttribute("blogs", iBlogService.findById(id));
        return "edit";
    }

    @PostMapping("update")
    public String update(Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.update(blog);
        redirectAttributes.addFlashAttribute("message", "Suceess");
        return "redirect:/blog/list";
    }


    @GetMapping("{id}/delete")
    public String getDelete(@PathVariable int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categories",categoryList);
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("success", "Removed product successfully");
        return "redirect:/blog/list";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
        return "view";
    }

    @PostMapping("/search")
    public String search(@RequestParam String name, Pageable pageable,Model model){
        Page<Blog>blogs = iBlogService.searchByName(name,pageable);
        model.addAttribute("blogs",blogs);
        return "list";
    }

}