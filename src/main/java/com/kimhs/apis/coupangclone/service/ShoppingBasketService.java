package com.kimhs.apis.coupangclone.service;

import com.kimhs.apis.coupangclone.repository.ShoppingBasketRepository;
import com.kimhs.apis.coupangclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ShoppingBasketService {
    private final ShoppingBasketRepository shoppingBasketRepository;

    @Autowired
    public ShoppingBasketService(ShoppingBasketRepository shoppingBasketRepository) {
        this.shoppingBasketRepository = shoppingBasketRepository;
    }
}
