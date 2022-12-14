package com.example.controller;

import com.example.model.Customer;
import com.example.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {



    @Autowired
    ICustomerService iCustomerService;


    @GetMapping()
    public String index(Model model) {

        List<Customer> customerList = iCustomerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";

    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping("/save")
    public String save(Customer customer) {
        customer.setId((int) (Math.random() * 1000));
        iCustomerService.save(customer);
        return "redirect:/customer";
    }

    @RequestMapping("/view")
    public String create(){
        return "create";
    }
}
