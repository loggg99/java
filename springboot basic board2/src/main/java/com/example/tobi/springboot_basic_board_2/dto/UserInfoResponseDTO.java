package com.example.tobi.springboot_basic_board_2.dto;


import com.example.tobi.springboot_basic_board_2.enums.Role;
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
