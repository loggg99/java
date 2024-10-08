package com.example.tobi.springbootfeigndata.dto;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class DataResponse {
    private Long id;
    private String name;
    private int value;
}
