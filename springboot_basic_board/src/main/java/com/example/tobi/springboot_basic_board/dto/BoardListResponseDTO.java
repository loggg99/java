package com.example.tobi.springboot_basic_board.dto;

import com.example.tobi.springboot_basic_board.model.Board;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BoardListResponseDTO {
    List<Board> boards;
    boolean last;
}
