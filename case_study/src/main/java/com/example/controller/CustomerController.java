package com.example.controller;

import com.example.dto.CustomerDto;
import com.example.model.customer.Customer;
import com.example.service.customer.ICustomerService;
import com.example.service.customer.ICustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @Autowired
    private ICustomerTypeService iCustomerTypeService;


    @GetMapping("/create")
    public String getCreate(Model model) {
        model.addAttribute("customerDto", new CustomerDto());
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "customer/create";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute CustomerDto customerDto, RedirectAttributes redirectAttributes){
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("mess","Add successfully");
        return "redirect:/customer";
    }

    @GetMapping()
    public String showList(Model model){
        model.addAttribute("customerList", iCustomerService.findAll());
        return "/customer/list";
    }

    @GetMapping("/{id}/edit")
    public String getEdit(@PathVariable int id,Model model){
        Optional<Customer> customer = iCustomerService.findById(id);
        model.addAttribute("customerDto",customer);
        model.addAttribute("customerTypeList", iCustomerTypeService.findAll());
        return "customer/edit";
    }



}
