package com.products.domain.interfaces.service;

import com.products.presentation.request.ProductRequest;

public interface ProcessRequestService {
    Boolean IsValidRequest(ProductRequest req);

}
