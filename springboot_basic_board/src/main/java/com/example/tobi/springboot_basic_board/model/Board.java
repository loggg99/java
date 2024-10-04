package com.example.tobi.springboot_basic_board.model;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class Board {
    private Long id;
    private String title;
    private String userId;
    private String content;
    private LocalDateTime created;
}
