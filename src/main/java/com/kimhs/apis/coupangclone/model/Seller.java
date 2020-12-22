package com.kimhs.apis.coupangclone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sellerId;

    @Column
    private String name;

    @Column
    private String companyAddress;

    @Column
    private String businessForm;

    @Column
    private Date registryDate;

    @Builder
    public Seller(String name, String companyAddress,
                  String businessForm, Date registryDate) {
        this.name = name;
        this.companyAddress = companyAddress;
        this.businessForm = businessForm;
        this.registryDate = registryDate;
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
