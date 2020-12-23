package com.kimhs.apis.coupangclone.repository;

import com.kimhs.apis.coupangclone.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
}
// 임시저장