package com.kimhs.apis.coupangclone.route;

import com.kimhs.apis.coupangclone.datamodel.dto.ReviewDTO;
import com.kimhs.apis.coupangclone.datamodel.dto.SellerDTO;
import com.kimhs.apis.coupangclone.service.SellerService;
import com.kimhs.apis.coupangclone.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerRoute {
    private final SellerService sellerService;

    @Autowired
    public SellerRoute(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping("")
    @ResponseBody
    public List<SellerDTO> getSellers() {
        return null;
    }

    @GetMapping("/id/{seller_id}")
    @ResponseBody
    public SellerDTO getReviewById(@PathVariable(value = "seller_id") String sellerId) {
        return null;
    }

    @GetMapping("/update/{seller_id}")
    public void updateCompanyAddress(@PathVariable(value = "seller_id") String sellerId) {
    }

    @GetMapping("/update/name/{seller_name}")
    public void updateName(@PathVariable(value = "seller_name") String sellerId) {
    }

    @GetMapping("/update/id/{seller_id}")
    public void updateBusinessForm(@PathVariable(value = "seller_id") String sellerId) {
    }

    @PostMapping("/registry")
    public void registrySeller() {
    }

    @DeleteMapping("/{seller_id}")
    public void deleteSeller(@PathVariable(value = "seller_id") String sellerId) {
    }

    @GetMapping("/initialize")
    public void initializeSellers() {
    }
}
