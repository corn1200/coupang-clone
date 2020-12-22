package com.kimhs.apis.coupangclone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int couponId;

    @Column
    private int userId;

    @Column
    private String issuedStatus;

    @Column
    private Date issuedDate;

    @Column
    private int validDay;

    @Column
    private Date validDate;

    @Column
    private String validCategory;

    @Column
    private int validProductId;

    @Column
    private int discountCost;

    @Column
    private int discountPercentage;

    @Column
    private String usedStatus;

    @Builder
    public Coupon(int userId, String issuedStatus, Date issuedDate,
                  int validDay, Date validDate, String validCategory,
                  int validProductId, int discountCost, int discountPercentage,
                  String usedStatus) {
        this.userId = userId;
        this.issuedStatus = issuedStatus;
        this.issuedDate = issuedDate;
        this.validDay = validDay;
        this.validDate = validDate;
        this.validCategory = validCategory;
        this.validProductId = validProductId;
        this.discountCost = discountCost;
        this.discountPercentage = discountPercentage;
        this.usedStatus = usedStatus;
    }

    @Override
    public String toString() {
        return String.format(
                "Coupon[coupon_id=%d, user_id=%d," +
                        " issued_status='%s', issued_date='%s'," +
                        " valid_day=%d, valid_date='%s'," +
                        " valid_category='%s', valid_product_id=%d," +
                        " discount_cost=%d, discount_percentage=%d," +
                        " used_status='%s']",
                this.couponId, this.userId,
                this.issuedStatus, this.issuedDate,
                this.validDay, this.validDate,
                this.validCategory, this.validProductId,
                this.discountCost, this.discountPercentage,
                this.usedStatus
        );
    }
}
