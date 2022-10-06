package com.example.controller;

import com.example.dto.FacilityDto;
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
import org.springframework.web.bind.annotation.*;
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
    public String getCreate(Model model) {
        model.addAttribute("facility", new FacilityDto());
        model.addAttribute("facilityType", facilityTypeService.findAll());
        model.addAttribute("rentType", renTypeService.findAll());
        return "facility/create";
    }

    @GetMapping()
    public String getList(@RequestParam(value = "name", defaultValue = "") String name,@PageableDefault(value = 2) Pageable pageable, Model model) {
        model.addAttribute("facilityList", facilityService.search(pageable,name));
        model.addAttribute("name", name);
        return "/facility/list";
    }

    @PostMapping("/save")
    public String create(@ModelAttribute FacilityDto facilityDto, RedirectAttributes redirectAttributes) {
        Facility facility = new Facility();
        BeanUtils.copyProperties(facilityDto, facility);
        facilityService.save(facility);
        redirectAttributes.addFlashAttribute("mess", "Add successfully");
        return "redirect:/facility";
    }

    @GetMapping("/{id}/edit")
    public String getEditForm(@PathVariable(value = "id") int id, Model model) {
        model.addAttribute("facility", facilityService.findById(id).get());
        model.addAttribute("rentType", renTypeService.findAll());
        return "facility/edit";
    }

    @PostMapping("/edit")
    public String save(@ModelAttribute Facility facility) {
        facilityService.save(facility);
        return "redirect:/facility";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam(value = "idDelete")int id,RedirectAttributes redirectAttributes){
        facilityService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "Delete successfully");
        return "redirect:/facility";
    }
}
