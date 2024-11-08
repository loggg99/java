package com.example.tobi.springboot_basic_board.mapper;

import com.example.tobi.springboot_basic_board.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void signUp(Member member);
    Member signIn(String userId);
}