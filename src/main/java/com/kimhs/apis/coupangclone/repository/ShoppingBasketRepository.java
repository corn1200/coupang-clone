package com.kimhs.apis.coupangclone.repository;

import com.kimhs.apis.coupangclone.model.Product;
import com.kimhs.apis.coupangclone.model.ShoppingBasket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingBasketRepository extends JpaRepository<ShoppingBasket, Integer> {
}
