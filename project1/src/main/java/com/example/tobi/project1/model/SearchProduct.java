package com.example.tobi.project1.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Builder
public class SearchProduct {
    private int id;
    private String category;
    private int sellerId;
    private String content;
    private String title;
    private String contentImg;
    private LocalDateTime created;
    private LocalDateTime updated;
    private boolean salesStatus;
    private int stock;
    private int price;
    private int temperature;
    private int precipitation;
}
