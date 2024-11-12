package com.example.tobi.springsecuritytasha.service;

import com.example.tobi.springsecuritytasha.dto.SignInResponseDTO;
import com.example.tobi.springsecuritytasha.mapper.MemberMapper;
import com.example.tobi.springsecuritytasha.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public void signUp(Member member) {
        memberMapper.signUp(member);
    }

    public SignInResponseDTO signIn(Member member) {
        memberMapper.signIn(member.getUserId());

    }


}
