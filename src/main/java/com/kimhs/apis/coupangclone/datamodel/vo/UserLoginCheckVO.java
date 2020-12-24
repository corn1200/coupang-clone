package com.kimhs.apis.coupangclone.datamodel.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserLoginCheckVO {
    private String email;
    private String password;

    @Override
    public String toString() {
        return String.format(
                "UserLoginCheckVO[email='%s', password='%s']",
                this.email, this.password
        );
    }
}
