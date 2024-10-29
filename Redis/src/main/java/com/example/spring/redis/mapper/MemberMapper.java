package com.example.spring.redis.mapper;

import com.example.spring.redis.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void signUp(Member member);
    Member signIn(String userId);
}
