package com.example.tobi.himedia_shop.project.model;


import lombok.*;

import java.time.LocalDateTime;



@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Long id;
    private Long sellerId;
    private String title;
    private String content;
    private String contentImg;
    private LocalDateTime created;
    private LocalDateTime updated;
    private Boolean salesStatus;
    private Integer stock;
    private Integer price;

}

