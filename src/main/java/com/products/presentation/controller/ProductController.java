package com.products.presentation.controller;


import com.products.application.interfaces.ProductService;
import com.products.presentation.response.ProductResponse;
import com.products.presentation.request.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/index")
    public String index(){
        return "HOLAAAA";
    }

    @PostMapping("/coupon")
    public ProductResponse GetProductsAPI(@RequestBody ProductRequest req){
        return this.productService.GetProductListFromApi(req);
    }
}
