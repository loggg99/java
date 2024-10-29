package com.example.spring.redis.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Paging {
    private int offset;
    private int size;
}