package com.kimhs.apis.coupangclone.datamodel.dto;

import com.kimhs.apis.coupangclone.model.Review;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class ReviewDTO {
    private int reviewId;
    private int productId;
    private int writerId;
    private String writeContents;
    private Date writeDate;
    private int starGrade;

    public ReviewDTO(Review review) {
        this.productId = review.getProductId();
        this.writerId = review.getWriterId();
        this.writeContents = review.getWriteContents();
        this.writeDate = review.getWriteDate();
        this.starGrade = review.getStarGrade();
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
