package com.example.tobi.springsecuritytasha.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Paging {
    private int offset;
    private int size;
}
