package com.kimhs.apis.coupangclone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    @Column
    private int productId;

    @Column
    private int writerId;

    @Column
    private String writeContents;

    @Column
    private Date writeDate;

    @Column
    private int starGrade;

    @Builder
    public Review(int productId, int writerId,
                  String writeContents, Date writeDate,
                  int starGrade) {
        this.productId = productId;
        this.writerId = writerId;
        this.writeContents = writeContents;
        this.writeDate = writeDate;
        this.starGrade = starGrade;
    }

    @Override
    public String toString() {
        return String.format(
                "Review[review_id=%d, product_id=%d," +
                        " writerId=%d, writeContents='%s'," +
                        " writeDate='%s', starGrade=%d]",
                this.reviewId, this.productId,
                this.writerId, this.writeContents,
                this.writeDate, this.starGrade
        );
    }
}
