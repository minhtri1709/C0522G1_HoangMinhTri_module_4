package com.example.controller;

import com.example.dto.UserDto;
import com.example.model.User;
import com.example.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;


    @GetMapping("/list")
    public String getList(@PageableDefault(value = 3) Pageable pageable, Model model){
        Page<User> userList = iUserService.findAll(pageable);
        model.addAttribute("users",userList);
        return "list";
    }

    @GetMapping("/create")
    public String getCreateForm(Model model){
        model.addAttribute("userDto",new UserDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated UserDto userDto, BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            return "create";
        }
        else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            iUserService.save(user);
            return "result";
        }

    }
}
