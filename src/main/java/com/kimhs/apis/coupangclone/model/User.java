package com.kimhs.apis.coupangclone.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private Date registryDate;

    @Builder
    public User(String email, String password,
                String name, Date registryDate) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.registryDate = registryDate;
    }

    @Override
    public String toString() {
        return String.format(
                "User[user_id=%d, email='%s'," +
                        " password='%s', name='%s'," +
                        " registry_date='%s']",
                this.userId, this.email,
                this.password, this.name,
                this.registryDate
        );
    }
}
