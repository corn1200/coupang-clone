package com.kimhs.apis.coupangclone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saleId;

    @Column
    private int ordererId;

    @Column
    private int productId;

    @Column
    private int originCost;

    @Column
    private int paymentCost;

    @Column
    private int discountCost;

    @Column
    private int discountPercentage;

    @Column
    private Date departureDate;

    @Column
    private Date arrivalDate;

    @Column
    private Date expectedArrivalDate;

    @Column
    private Date depositPriceDate;

    @Column
    private int rocketDeliveryStatus;

    @Column
    private String depositStatus;

    @Column
    private int deliveryStatus;

    @Column
    private String transactionStatus;

    @Column
    private String deliveryAddress;

    @Column
    private String cashReceipts;

    @Column
    private String paymentWay;

    @Builder
    public Sale(int ordererId, int productId,
                int originCost, int paymentCost,
                int discountCost, int discountPercentage,
                Date departureDate, Date arrivalDate,
                Date expectedArrivalDate, Date depositPriceDate,
                int rocketDeliveryStatus, String depositStatus,
                int deliveryStatus, String transactionStatus,
                String deliveryAddress, String cashReceipts,
                String paymentWay) {
        this.ordererId = ordererId;
        this.productId = productId;
        this.originCost = originCost;
        this.paymentCost = paymentCost;
        this.discountCost = discountCost;
        this.discountPercentage = discountPercentage;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.expectedArrivalDate = expectedArrivalDate;
        this.depositPriceDate = depositPriceDate;
        this.rocketDeliveryStatus = rocketDeliveryStatus;
        this.depositStatus = depositStatus;
        this.deliveryStatus = deliveryStatus;
        this.transactionStatus = transactionStatus;
        this.deliveryAddress = deliveryAddress;
        this.cashReceipts = cashReceipts;
        this.paymentWay = paymentWay;
    }

    @Override
    public String toString() {
        return String.format(
                "Sale[sale_id=%d, orderer_id=%d," +
                " product_id=%d, origin_cost=%d," +
                " payment_cost=%d, discount_cost=%d," +
                " discount_percentage=%d, departure_date='%s'," +
                " arrival_date='%s', expected_arrival_date='%s'," +
                " deposit_price_date='%s', rocket_delivery_status=%d," +
                " deposit_status='%s', delivery_status=%d," +
                " transaction_status='%s', delivery_address='%s'," +
                " cashReceipts='%s', paymentWay='%s']",
                this.saleId, this.ordererId,
                this.productId, this.originCost,
                this.paymentCost, this.discountCost,
                this.discountPercentage, this.departureDate,
                this.arrivalDate, this.expectedArrivalDate,
                this.depositPriceDate, this.rocketDeliveryStatus,
                this.depositStatus, this.deliveryStatus,
                this.transactionStatus, this.deliveryAddress,
                this.cashReceipts, this.paymentWay
        );
    }
}
