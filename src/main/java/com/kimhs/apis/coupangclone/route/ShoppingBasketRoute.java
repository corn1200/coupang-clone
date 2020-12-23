package com.kimhs.apis.coupangclone.route;

import com.kimhs.apis.coupangclone.datamodel.dto.ShoppingBasketDTO;
import com.kimhs.apis.coupangclone.service.ShoppingBasketService;
import com.kimhs.apis.coupangclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingBasket")
public class ShoppingBasketRoute {
    private final ShoppingBasketService shoppingBasketService;

    @Autowired
    public ShoppingBasketRoute(ShoppingBasketService shoppingBasketService) {
        this.shoppingBasketService = shoppingBasketService;
    }

    @GetMapping("")
    @ResponseBody
    public List<ShoppingBasketDTO> getShoppingBaskets() {
        return null;
    }

    @GetMapping("/id/{shoppingBasket_id}")
    @ResponseBody
    public ShoppingBasketDTO getShoppingBasketById(@PathVariable(value = "shoppingBasket_id") String shoppingBasketId) {
        return null;
    }

    @GetMapping("/userId/{user_id}")
    @ResponseBody
    public List<ShoppingBasketDTO> getShoppingBasketsByUserId(@PathVariable(value = "user_id") String userId) {
        return null;
    }

    @GetMapping("/totalPrice/{user_id}")
    @ResponseBody
    public int getTotalPriceByUserId(@PathVariable(value = "user_id") String userId) {
        return 0;
    }

    @PostMapping("/registry")
    public void registryShoppingBasket() {
    }

    @DeleteMapping("/{shopping_basket_id}")
    public void deleteShoppingBasket(@PathVariable(value = "shopping_basket_id") String shoppingBasketId) {
    }

    @DeleteMapping("/{user_id}")
    public void deleteShoppingBasketByUserId(@PathVariable(value = "user_id") String userId) {
    }

    @GetMapping("/initialize")
    public void initializeShoppingBaskets() {
    }
}
