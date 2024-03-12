package com.abhishek.springprojecttutorials.controller;

import com.abhishek.springprojecttutorials.DTO.FakeStoreProductDto;
import com.abhishek.springprojecttutorials.Service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

//    ProductService ps;
//
//    ProductController(ProductService ps) {
//        this.ps = ps;
//    }

    @GetMapping("/carts/")
    public FakeStoreProductDto[] getAllProducts() {
        ProductService ps = new ProductService();
        return ps.getAllProducts();
    }

    @GetMapping("/carts/{id}")
    public FakeStoreProductDto getProductById(@PathVariable Long id) {
        ProductService ps = new ProductService();
        return ps.getProductById(id);
    }

}
