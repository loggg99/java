package com.example.tobi.notice.service;

import com.example.tobi.notice.dto.UserDTO;
import com.example.tobi.notice.mapper.UserMapper;
import com.example.tobi.notice.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;



    public void registerUser(UserDTO userDTO) {
        userMapper.registerUser(userDTO.toUser());
    }
}
