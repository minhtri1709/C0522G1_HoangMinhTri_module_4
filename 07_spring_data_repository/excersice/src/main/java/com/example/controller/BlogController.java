package com.example.controller;

import com.example.dto.BlogDto;
import com.example.model.Blog;
import com.example.model.Category;
import com.example.service.IBlogService;
import com.example.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController

public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;


    @RequestMapping(value = "blog/list", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> getList() {
         List<Blog> blogList = iBlogService.findAll();
        if(blogList.isEmpty()){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogList,HttpStatus.OK);

    }





    @GetMapping("/{id}/delete")
    public String getDelete(@PathVariable int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
        List<Category> categoryList = iCategoryService.findAll();
        model.addAttribute("categories",categoryList);
        return "/blog/delete";
    }


    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("blogs", iBlogService.findById(id));
        return "blog/view";
    }

//    @GetMapping ("/search")
//    public String search(@PageableDefault(value = 2)Pageable pageable, @RequestParam(defaultValue = "") String name, Model model){
//        Page<Blog>blogs = iBlogService.searchByName(name,pageable);
//        model.addAttribute("blogs",blogs);
//        model.addAttribute("name",name);
//        return "blog/list";
//    }

  @GetMapping("/dto")
    public String getIndex(Model model){
        List<BlogDto> blogDtos = iBlogService.findAllBlogDto();
        model.addAttribute("blogs", blogDtos);
        return "blog/index";
  }

}
