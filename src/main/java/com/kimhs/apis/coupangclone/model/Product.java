package com.kimhs.apis.coupangclone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column
    private Date produceDate;

    @Column
    private int salePrice;

    @Column
    private int originPrice;

    @Column
    private String category;

    @Column
    private String name;

    @Column
    private int inventoryAccount;

    @Column
    private Date registryDate;

    @Column
    private int rocketDelivery;

    @Column
    private int sellerId;

    @Builder
    public Product(Date produceDate, int salePrice,
                   int originPrice, String category,
                   String name, int inventoryAccount,
                   Date registryDate, int rocketDelivery,
                   int sellerId) {
        this.produceDate = produceDate;
        this.salePrice = salePrice;
        this.originPrice = originPrice;
        this.category = category;
        this.name = name;
        this.inventoryAccount = inventoryAccount;
        this.registryDate = registryDate;
        this.rocketDelivery = rocketDelivery;
        this.sellerId = sellerId;
    }

    @Override
    public String toString() {
        return String.format(
                "Product[product_id=%d, produce_date='%s'," +
                        " sale_price=%d, origin_price=%d," +
                        " category='%s', name='%s'," +
                        " inventory_account=%d, registry_date='%s'," +
                        " rocket_delivery=%d, seller_id=%d]",
                this.productId, this.produceDate,
                this.salePrice, this.originPrice,
                this.category, this.name, this.inventoryAccount,
                this.registryDate, this.rocketDelivery,
                this.sellerId
        );
    }
}
