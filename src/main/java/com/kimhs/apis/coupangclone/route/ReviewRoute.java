package com.kimhs.apis.coupangclone.route;

import com.kimhs.apis.coupangclone.datamodel.dto.CouponDTO;
import com.kimhs.apis.coupangclone.datamodel.dto.ReviewDTO;
import com.kimhs.apis.coupangclone.service.ReviewService;
import com.kimhs.apis.coupangclone.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewRoute {
    private final ReviewService reviewService;

    @Autowired
    public ReviewRoute(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("")
    @ResponseBody
    public List<ReviewDTO> getReviews() {
        return null;
    }

    @GetMapping("/id/{review_id}")
    @ResponseBody
    public ReviewDTO getReviewById(@PathVariable(value = "review_id") String reviewId) {
        return null;
    }

    @GetMapping("/userId/{user_id}")
    @ResponseBody
    public List<ReviewDTO> getReviewByUserId(@PathVariable(value = "user_id") String userId) {
        return null;
    }

    @GetMapping("/productId/{product_id}")
    @ResponseBody
    public List<ReviewDTO> getReviewByProductId(@PathVariable(value = "product_id") String productId) {
        return null;
    }

    @PostMapping("/registry")
    public void registryReview() {
    }

    @DeleteMapping("/{review_id}")
    public void deleteReview(@PathVariable(value = "review_id") String reviewId) {
    }

    @GetMapping("/initialize")
    public void initializeReviews() {
    }
}
