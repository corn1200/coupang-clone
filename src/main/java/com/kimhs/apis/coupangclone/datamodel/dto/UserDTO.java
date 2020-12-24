package com.kimhs.apis.coupangclone.datamodel.dto;

import com.kimhs.apis.coupangclone.model.User;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private int userId;
    private String email;
    private String password;
    private String name;
    private Date registryDate;
    
    public UserDTO(User user) {
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.name = user.getName();
        this.registryDate = user.getRegistryDate();
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
