package com.example.tobi.springboot_basic_board_2.mapper;

import com.example.tobi.springboot_basic_board_2.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void signUp(Member member);
    Member findByUserId(String userId);
}