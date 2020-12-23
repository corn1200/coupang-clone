package com.kimhs.apis.coupangclone.repository;

import com.kimhs.apis.coupangclone.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
