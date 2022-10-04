package com.example.controller;

import com.example.dto.CustomerDto;
import com.example.dto.FacilityDto;
import com.example.model.customer.Customer;
import com.example.model.facility.Facility;
import com.example.service.facility.IFacilityService;
import com.example.service.facility.IFacilityTypeService;
import com.example.service.facility.IRenTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/facility")
public class FacilityController {
    @Autowired
    private IFacilityService facilityService;

    @Autowired
    private IFacilityTypeService facilityTypeService;

    @Autowired
    private IRenTypeService renTypeService;


    @GetMapping("/create")
    public String getCreate(Model model){
        model.addAttribute("facility", new FacilityDto());
        model.addAttribute("facilityType", facilityTypeService.findAll());
        model.addAttribute("rentType",renTypeService.findAll());
        return "facility/create";
    }

    @GetMapping()
    public String getList(@PageableDefault(value = 2)Pageable pageable, Model model){
        model.addAttribute("facilityList", facilityService.findAll(pageable));
        return "/facility/list";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute FacilityDto facilityDto, RedirectAttributes redirectAttributes){
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess","Add successfully");
        return "redirect:/facility";
    }
}
