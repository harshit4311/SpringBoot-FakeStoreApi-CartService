package com.abhishek.springprojecttutorials.Service;

import com.abhishek.springprojecttutorials.DTO.FakeStoreProductDto;
import org.springframework.web.client.RestTemplate;

public class ProductService {

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public FakeStoreProductDto[] getAllProducts() {
        FakeStoreProductDto response[] = restTemplate.getForObject(url +"/carts/", FakeStoreProductDto[].class);
        return response;
    }

    public FakeStoreProductDto getProductById(Long id) {
        var response = restTemplate.getForObject(url+ "/carts/" +id, FakeStoreProductDto.class);
        return response;
    }

}
