package com.kimhs.apis.coupangclone.datamodel.dto;

import com.kimhs.apis.coupangclone.model.Sale;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class SaleDTO {
    private int saleId;
    private int ordererId;
    private int productId;
    private int originCost;
    private int paymentCost;
    private int discountCost;
    private int discountPercentage;
    private Date departureDate;
    private Date arrivalDate;
    private Date expectedArrivalDate;
    private Date depositPriceDate;
    private int rocketDeliveryStatus;
    private String depositStatus;
    private int deliveryStatus;
    private String transactionStatus;
    private String deliveryAddress;
    private String cashReceipts;
    private String paymentWay;

    public SaleDTO(Sale sale) {
        this.ordererId = sale.getOrdererId();
        this.productId = sale.getProductId();
        this.originCost = sale.getOriginCost();
        this.paymentCost = sale.getPaymentCost();
        this.discountCost = sale.getDiscountCost();
        this.discountPercentage = sale.getDiscountPercentage();
        this.departureDate = sale.getDepartureDate();
        this.arrivalDate = sale.getArrivalDate();
        this.expectedArrivalDate = sale.getExpectedArrivalDate();
        this.depositPriceDate = sale.getDepositPriceDate();
        this.rocketDeliveryStatus = sale.getRocketDeliveryStatus();
        this.depositStatus = sale.getDepositStatus();
        this.deliveryStatus = sale.getDeliveryStatus();
        this.transactionStatus = sale.getTransactionStatus();
        this.deliveryAddress = sale.getDeliveryAddress();
        this.cashReceipts = sale.getCashReceipts();
        this.paymentWay = sale.getPaymentWay();
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
