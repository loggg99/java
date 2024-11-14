package com.example.tobi.springsecuritytasha.dto;

import com.example.tobi.springsecuritytasha.enums.Role;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserInfoResponseDTO {
    private long Id;
    private String userId;
    private String userName;
    private Role role;
}
