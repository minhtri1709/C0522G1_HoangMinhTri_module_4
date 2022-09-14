package com.excercise.controller;

import com.excercise.model.Product;
import com.excercise.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("product/")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("list")
    public String getList(Model model) {

        List<Product> productList = iProductService.findAll();
        model.addAttribute("product", productList);
        return "list";
    }

    @GetMapping("/create")
    public String getCreate(Model model){
         model.addAttribute("product",new Product());
         return "create";
    }

    @PostMapping("save")
    public String save(Product product, RedirectAttributes redirect){
        product.setId((int) (Math.random() * 1000));
        iProductService.save(product);
        redirect.addFlashAttribute("mess","Success");
        return "redirect:/list";
    }

    @GetMapping("{id}/edit")
    public String getEdit(@PathVariable int id, Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "edit";
    }

    @PostMapping("update")
    public String update(Product product, RedirectAttributes redirectAttributes){
        iProductService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("message","Suceess");
        return "redirect:/product/list";
    }

    @GetMapping("{id}/delete")
    public String getDelete(@PathVariable int id,Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes){
        iProductService.delete(product.getId());
        redirectAttributes.addFlashAttribute("success","Removed product successfully");
        return "redirect:/product/list";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "view";
    }

    @PostMapping("search")
    public String search(@RequestParam String name,Model model){
        List<Product> productList = iProductService.findByName(name);
        model.addAttribute("product",productList);
        return "/list";
    }
}
