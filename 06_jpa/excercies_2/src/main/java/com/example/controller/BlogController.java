package com.example.controller;

import com.example.model.Blog;
import com.example.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("blog/")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("list")
    public String getList(Model model) {

        List<Blog> blogList = iBlogService.findAll();
        model.addAttribute("blogs", blogList);
        return "list";
    }

    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("blogs", new Blog());
        return "create";
    }

    @PostMapping("save")
    public String save(Blog blog, RedirectAttributes redirect) {
        blog.setId((int) (Math.random() * 1000));
        iBlogService.save(blog);
        redirect.addFlashAttribute("mess", "Success");
        return "redirect:/blog/list";
    }

    @GetMapping("{id}/edit")
    public String getEdit(@PathVariable int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
        return "edit";
    }

    @PostMapping("update")
    public String update(Blog blog, RedirectAttributes redirectAttributes) {
        iBlogService.update(blog);
        System.out.println(blog.getName());
        redirectAttributes.addFlashAttribute("message", "Suceess");
        return "redirect:/blog/list";
    }


    @GetMapping("{id}/delete")
    public String getDelete(@PathVariable int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
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


}
