package com.products.application.interfaces;

import com.products.presentation.request.ProductRequest;
import com.products.presentation.response.ProductResponse;

public interface ProductService {
    ProductResponse GetProductListFromApi(ProductRequest req);
}
