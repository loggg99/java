package com.example.tobi.springboot_basic_board_2.dto;

import com.example.tobi.springboot_basic_board_2.model.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignInRequestDTO {
    private String userId;
    private String password;


}
