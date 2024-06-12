package com.products.domain.interfaces.service;

import com.products.presentation.dto.ProductRequest;

public interface ProcessRequestProductsId {
    Boolean IsValidRequest(ProductRequest req);
}
