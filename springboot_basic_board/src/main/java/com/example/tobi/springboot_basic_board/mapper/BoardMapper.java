package com.example.tobi.springboot_basic_board.mapper;

import com.example.tobi.springboot_basic_board.model.Board;
import com.example.tobi.springboot_basic_board.model.Paging;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> selectBoardList(Paging page);
    int countBoards();
    Board selectBoardDetail(long id);
}