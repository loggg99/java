package com.example.tobi.springbootbasicboard.model;

import com.example.tobi.springbootbasicboard.dto.BoardDetailResponseDTO;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Board extends BoardDetailResponseDTO {
    private String id;
    private String title;
    private String content;
    private String userId;
    private String filePath;
    private LocalDateTime created;


}