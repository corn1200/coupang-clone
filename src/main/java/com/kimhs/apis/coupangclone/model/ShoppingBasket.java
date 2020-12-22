package com.kimhs.apis.coupangclone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class ShoppingBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int shoppingBasketId;

    @Column
    private int productId;

    @Column
    private int userId;

    @Builder
    public ShoppingBasket(int productId, int userId) {
        this.productId = productId;
        this.userId = userId;
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
