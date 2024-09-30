package com.example.tobi.notice.dto;

import com.example.tobi.notice.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private Long id;
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
