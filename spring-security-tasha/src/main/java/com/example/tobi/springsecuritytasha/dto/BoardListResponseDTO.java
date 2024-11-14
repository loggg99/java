package com.example.tobi.springsecuritytasha.dto;

import com.example.tobi.springsecuritytasha.model.Board;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BoardListResponseDTO {
    List<Board> boards;
    boolean last;
}
