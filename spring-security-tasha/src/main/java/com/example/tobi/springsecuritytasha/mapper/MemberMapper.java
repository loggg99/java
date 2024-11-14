package com.example.tobi.springsecuritytasha.mapper;

import com.example.tobi.springsecuritytasha.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void signUp(Member member);
    Member findByUserId(String userId);
}
