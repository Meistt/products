package com.products.domain.interfaces;

import com.products.presentation.request.ProductRequest;

public interface ProcessRequestProductsId {
    Boolean IsValidRequest(ProductRequest req);
}
