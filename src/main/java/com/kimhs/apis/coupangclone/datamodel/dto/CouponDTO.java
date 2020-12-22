package com.kimhs.apis.coupangclone.datamodel.dto;

import com.kimhs.apis.coupangclone.model.Coupon;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class CouponDTO {
    private int couponId;
    private int userId;
    private String issuedStatus;
    private Date issuedDate;
    private int validDay;
    private Date validDate;
    private String validCategory;
    private int validProductId;
    private int discountCost;
    private int discountPercentage;
    private String usedStatus;

    public CouponDTO(Coupon coupon) {
        this.userId = coupon.getUserId();
        this.issuedStatus = coupon.getIssuedStatus();
        this.issuedDate = coupon.getIssuedDate();
        this.validDay = coupon.getValidDay();
        this.validDate = coupon.getValidDate();
        this.validCategory = coupon.getValidCategory();
        this.validProductId = coupon.getValidProductId();
        this.discountCost = coupon.getDiscountCost();
        this.discountPercentage = coupon.getDiscountPercentage();
        this.usedStatus = coupon.getUsedStatus();
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
