package com.kimhs.apis.coupangclone.service;

import com.kimhs.apis.coupangclone.repository.SellerRepository;
import com.kimhs.apis.coupangclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SellerService {
    private final SellerRepository sellerRepository;

    @Autowired
    public SellerService(SellerRepository sellerRepository) {
        this.sellerRepository = sellerRepository;
    }
}
