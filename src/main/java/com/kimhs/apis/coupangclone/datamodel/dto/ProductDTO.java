package com.kimhs.apis.coupangclone.datamodel.dto;

import com.kimhs.apis.coupangclone.model.Product;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ProductDTO {
    private int productId;
    private Date produceDate;
    private int salePrice;
    private int originPrice;
    private String category;
    private String name;
    private int inventoryAccount;
    private Date registryDate;
    private int rocketDelivery;
    private int sellerId;

    public ProductDTO(Product product) {
        this.produceDate = product.getProduceDate();
        this.salePrice = product.getSalePrice();
        this.originPrice = product.getOriginPrice();
        this.category = product.getCategory();
        this.name = product.getName();
        this.inventoryAccount = product.getInventoryAccount();
        this.registryDate = product.getRegistryDate();
        this.rocketDelivery = product.getRocketDelivery();
        this.sellerId = product.getSellerId();
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
