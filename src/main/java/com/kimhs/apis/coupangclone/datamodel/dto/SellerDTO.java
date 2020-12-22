package com.kimhs.apis.coupangclone.datamodel.dto;

import com.kimhs.apis.coupangclone.model.Seller;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class SellerDTO {
    private int sellerId;
    private String name;
    private String companyAddress;
    private String businessForm;
    private Date registryDate;

    public SellerDTO(Seller seller) {
        this.name = seller.getName();
        this.companyAddress = seller.getCompanyAddress();
        this.businessForm = seller.getBusinessForm();
        this.registryDate = seller.getRegistryDate();
    }

    @Override
    public String toString() {
        return String.format(
                "Seller[seller_id=%d, name='%s'," +
                " company_address='%s', business_form='%s'," +
                " registry_date='%s']",
                this.sellerId, this.name,
                this.companyAddress, this.businessForm,
                this.registryDate
        );
    }
}
