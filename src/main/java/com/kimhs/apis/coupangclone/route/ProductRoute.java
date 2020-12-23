package com.kimhs.apis.coupangclone.route;

import com.kimhs.apis.coupangclone.datamodel.dto.ProductDTO;
import com.kimhs.apis.coupangclone.datamodel.dto.ReviewDTO;
import com.kimhs.apis.coupangclone.service.ProductService;
import com.kimhs.apis.coupangclone.service.ShoppingBasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRoute {
    private final ProductService productService;

    @Autowired
    public ProductRoute(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    @ResponseBody
    public List<ProductDTO> getProducts() {
        return null;
    }

    @GetMapping("/id/{product_id}")
    @ResponseBody
    public ProductDTO getProductById(@PathVariable(value = "product_id") String productId) {
        return null;
    }

    @GetMapping("/name/{product_name}")
    @ResponseBody
    public List<ProductDTO> getProductsByName(@PathVariable(value = "product_name") String productName) {
        return null;
    }

    @GetMapping("/category/{category}")
    @ResponseBody
    public List<ProductDTO> getProductsByCategory(@PathVariable(value = "category") String category) {
        return null;
    }

    @GetMapping("/review/{product_id}")
    @ResponseBody
    public List<ReviewDTO> getReviewsByProductId(@PathVariable(value = "product_id") String productId) {
        return null;
    }

    @PostMapping("/registry")
    public void registryProduct() {
    }

    @DeleteMapping("/{product_id}")
    public void deleteProduct(@PathVariable(value = "product_id") String productId) {
    }

    @GetMapping("/initialize")
    public void initializeProducts() {
    }
}
