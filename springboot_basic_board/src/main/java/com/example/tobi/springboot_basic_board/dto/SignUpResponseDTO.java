package com.example.tobi.springboot_basic_board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
public class SignUpResponseDTO {
    private String url;
}