package com.example.tobi.notice.mapper;

import com.example.tobi.notice.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void registerUser(User user);
    User findByEmail(String email);



}
