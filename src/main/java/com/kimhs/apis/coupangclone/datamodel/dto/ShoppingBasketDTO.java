package com.kimhs.apis.coupangclone.datamodel.dto;

import com.kimhs.apis.coupangclone.model.ShoppingBasket;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
public class ShoppingBasketDTO {
    private int shoppingBasketId;
    private int productId;
    private int userId;

    public ShoppingBasketDTO(ShoppingBasket shoppingBasket) {
        this.productId = shoppingBasket.getProductId();
        this.userId = shoppingBasket.getUserId();
    }

    @Override
    public String toString() {
        return String.format(
                "ShoppingBasket[shoppingBasketId=%d," +
                        " productId=%d," +
                        " userId=%d]",
                this.shoppingBasketId,
                this.productId,
                this.userId
        );
    }
}
