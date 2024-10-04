package com.example.tobi.springboot_basic_board.service;

import com.example.tobi.springboot_basic_board.dto.SignInResponseDTO;
import com.example.tobi.springboot_basic_board.mapper.MemberMapper;
import com.example.tobi.springboot_basic_board.model.Member;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    public void signUp(Member member) {
        memberMapper.signUp(member);
    }

    public SignInResponseDTO signIn(Member member, HttpSession session) {
        Member getMember = memberMapper.signIn(member.getUserid());
        if (getMember == null) {
            return makeSignInRequestDTO(false, "존재하지 않는 회원입니다.", null, null);
        }

        if ( !member.getPassword().equals(getMember.getPassword()) ) {
            return makeSignInRequestDTO(false, "비밀번호가 틀렸습니다.", null, null);
        }

        // 세션 설정
        session.setAttribute("userId", getMember.getUserid());
        session.setAttribute("userName", getMember.getName());

        return makeSignInRequestDTO(true, "로그인이 성공했습니다.", "/", member);
    }


    private SignInResponseDTO makeSignInRequestDTO(boolean isloggedIn, String message, String url, Member member) {
        return SignInResponseDTO.builder()
                .isLoggedIn(isloggedIn)
                .message(message)
                .url(url)
                .userId(isloggedIn ? member.getUserid() : null)
                .userName(isloggedIn ? member.getName() : null)
                .build();
    }

}