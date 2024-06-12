package com.products.delivery.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/index")
    public String index(){
        return "HOLAAAA";
    }
}
