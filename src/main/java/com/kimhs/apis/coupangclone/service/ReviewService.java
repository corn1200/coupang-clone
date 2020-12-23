package com.kimhs.apis.coupangclone.service;

import com.kimhs.apis.coupangclone.repository.ReviewRepository;
import com.kimhs.apis.coupangclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ReviewService {
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
}
