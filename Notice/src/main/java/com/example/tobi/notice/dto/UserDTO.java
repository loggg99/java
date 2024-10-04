package com.example.tobi.notice.dto;

import com.example.tobi.notice.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class UserDTO {
    private String id;
    private String name;
    private String email;
    private String phone;
    private String password;

    public User toUser() {
        return User.builder()
                .id(id)
                .name(name)
                .email(email)
                .phone(phone)
                .password(password)
                .build();
    }
}
