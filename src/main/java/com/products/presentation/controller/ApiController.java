package com.products.presentation.controller;


import com.products.domain.models.ProductResponse;
import com.products.presentation.request.ProductRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/index")
    public String index(){
        return "HOLAAAA";
    }

    @PostMapping("/coupon")
    public ProductResponse GetProductsAPI(@RequestBody ProductRequest req){
        return null;
    }
}
