package com.example.tobi.springboot_basic_board.service;

import com.example.tobi.springboot_basic_board.config.security.CustomUserDetails;
import com.example.tobi.springboot_basic_board.mapper.MemberMapper;
import com.example.tobi.springboot_basic_board.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final MemberMapper memberMapper;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Member member = memberMapper.signIn(username);
        if (member == null) {
            throw new UsernameNotFoundException(username + " not found");
        }

        return CustomUserDetails.builder()
                .member(member)
                .build();
    }
}
