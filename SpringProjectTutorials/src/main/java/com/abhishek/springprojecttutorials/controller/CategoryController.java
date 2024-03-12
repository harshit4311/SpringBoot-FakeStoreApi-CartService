package com.abhishek.springprojecttutorials.controller;

import com.abhishek.springprojecttutorials.Service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
//    CategoryService cs;

    @GetMapping("/category/")
    public String getCategoryById(@PathVariable Long id) {
        CategoryService cs = new CategoryService();
        return cs.getCategoryById(id);
    }

}
