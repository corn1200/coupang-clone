package com.kimhs.apis.coupangclone.service;

import com.kimhs.apis.coupangclone.repository.ProductRepository;
import com.kimhs.apis.coupangclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
