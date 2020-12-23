package com.kimhs.apis.coupangclone.route;

import com.kimhs.apis.coupangclone.datamodel.dto.CouponDTO;
import com.kimhs.apis.coupangclone.datamodel.dto.ShoppingBasketDTO;
import com.kimhs.apis.coupangclone.service.CouponService;
import com.kimhs.apis.coupangclone.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponRoute {
    private final CouponService couponService;

    @Autowired
    public CouponRoute(CouponService couponService) {
        this.couponService = couponService;
    }

    @GetMapping("")
    @ResponseBody
    public List<CouponDTO> getCoupons() {
        return null;
    }

    @GetMapping("/id/{coupon_id}")
    @ResponseBody
    public CouponDTO getCouponById(@PathVariable(value = "coupon_id") String couponId) {
        return null;
    }

    @GetMapping("/userId/{user_id}")
    @ResponseBody
    public List<CouponDTO> getCouponByUserId(@PathVariable(value = "user_id") String userId) {
        return null;
    }

    @GetMapping("/update/{coupon_id}")
    public void updateIssuedStatus(@PathVariable(value = "coupon_id") String couponId) {
    }

    @DeleteMapping("/update/{coupon_id}")
    public void updateUsedStatus(@PathVariable(value = "coupon_id") String couponId) {
    }

    @PostMapping("/registry")
    public void registryCoupon() {
    }

    @DeleteMapping("/{coupon_id}")
    public void deleteCoupon(@PathVariable(value = "coupon_id") String couponId) {
    }

    @GetMapping("/initialize")
    public void initializeCoupons() {
    }
}
