package com.example.spring.weathernotice.dto.weather;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Header {
    private String resultCode;
    private String resultMsg;
}