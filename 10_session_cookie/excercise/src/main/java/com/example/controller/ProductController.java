package com.example.controller;

import com.example.dto.CategoryDto;
import com.example.dto.ProductDto;
import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;


@SessionAttributes("cart")
@Controller
@RequestMapping("/shop")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @ModelAttribute("cart")
    public CategoryDto sessionInit() {
        return new CategoryDto();
    }

    @GetMapping
    public String getList(Model model, @CookieValue(value = "idProduct", defaultValue = "-1") int id) {
        if (id != -1) {
            model.addAttribute("oldProduct", iProductService.findById(id).get());
        }
        List<Product> productList = iProductService.findAll();
        model.addAttribute("products", productList);
        return "list";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(@PathVariable int id, Model model, HttpServletResponse response) {
        Cookie cookie = new Cookie("idProduct", id + "");
        cookie.setMaxAge(1 * 24 * 60);
        cookie.setPath("/");
        response.addCookie(cookie);
        model.addAttribute("product", iProductService.findById(id).get());
        return "detail";
    }

    @GetMapping("/add/{id}")
    public String getCart(@PathVariable int id, @SessionAttribute("cart") CategoryDto categoryDto){
        Optional<Product> productOptional = iProductService.findById(id);
        if(productOptional.isPresent()){
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(),productDto);
            categoryDto.addProduct(productDto);
        }
        return "redirect:/cart";

    }

    @GetMapping("/remove/{id}")
    public String getCartBack(@PathVariable int id, @SessionAttribute("cart") CategoryDto categoryDto){
        Optional<Product> productOptional = iProductService.findById(id);
        if(productOptional.isPresent()){
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(),productDto);
            categoryDto.declineProduct(productDto);
        }
        return "redirect:/cart";

    }
}
