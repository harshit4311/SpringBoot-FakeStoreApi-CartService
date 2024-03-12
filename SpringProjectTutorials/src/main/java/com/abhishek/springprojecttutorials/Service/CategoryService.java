package com.abhishek.springprojecttutorials.Service;

import com.abhishek.springprojecttutorials.DTO.FakeStoreProductDto;
import org.springframework.web.client.RestTemplate;
import java.util.*;

public class CategoryService {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";
    public String getCategoryById(Long id) {
        return "Category from service with" +id;
    }

    public FakeStoreProductDto[] getProductByCategory(String category) {
        var category_response = restTemplate.getForObject(url + "/products/category/" + category, FakeStoreProductDto[].class);
        return category_response;
    }

}
