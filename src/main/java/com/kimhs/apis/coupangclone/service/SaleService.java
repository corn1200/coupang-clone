package com.kimhs.apis.coupangclone.service;

import com.kimhs.apis.coupangclone.repository.SaleRepository;
import com.kimhs.apis.coupangclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SaleService {
    private final SaleRepository saleRepository;

    @Autowired
    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }
}
