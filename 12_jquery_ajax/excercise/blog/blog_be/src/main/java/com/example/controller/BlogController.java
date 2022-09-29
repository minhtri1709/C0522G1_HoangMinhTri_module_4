package com.example.controller;

import com.example.model.Blog;
import com.example.service.IBlogService;
import com.example.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @Autowired
    private ICategoryService iCategoryService;


    @RequestMapping(value = "blog/list", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> getList() {
        List<Blog> blogList = iBlogService.findAll();
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @RequestMapping(value = "blog/{id}/view", method = RequestMethod.GET)
    public ResponseEntity<Blog> view(@PathVariable int id) {
        Blog blog = iBlogService.searchById(id);
        if (blog == null) {
            System.out.println("Unable to view. Blog with id" + id + " not found.");
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Blog>(HttpStatus.OK);
    }

    @RequestMapping(value = "blog/search", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> searchByName(@RequestParam(defaultValue = "") String name) {
        List<Blog> blogList = iBlogService.searchByName(name);
        System.out.println(blogList.size());
        if (blogList.isEmpty()) {
            System.out.println("Unable to view. Blog with name" + name + " not found.");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }

    @RequestMapping(value = "blog/{id}/search/", method = RequestMethod.GET)
    public ResponseEntity<List<Blog>> searchByCategory(@PathVariable int id) {
        List<Blog> blogs = iBlogService.findByCategory(id);
        if (blogs.isEmpty()) {

            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(HttpStatus.OK);
    }
}
