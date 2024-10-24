package com.example.tobi.redis.mapper;

import com.example.tobi.redis.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    void signUp(Member member);
    Member signIn(String userId);
}
