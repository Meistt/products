package com.products.application.service;

import com.products.application.exception.InvalidRequestException;
import com.products.application.interfaces.ProductService;
import com.products.presentation.request.ProductRequest;
import com.products.presentation.response.ProductResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductResponse GetProductListFromApi(ProductRequest req) {
        if(!isValidRequest(req)){
            throw new InvalidRequestException("Invalid request, please check.");
        }
        return null;
    }

    private boolean isValidRequest(ProductRequest req) {
        try {
            return req != null;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
