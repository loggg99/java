package com.example.spring.redis.controller;

import com.example.spring.redis.dto.SignUpRequestDTO;
import com.example.spring.redis.dto.SignUpResponseDTO;
import com.example.spring.redis.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;
    // BCryptPasswordEncoder 주입

    @PostMapping("/join")
    public ResponseEntity<SignUpResponseDTO> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO) {
        memberService.signUp(signUpRequestDTO.toMember()); // 주입받은 bCryptPasswordEncoder를 전달합니다.
        return ResponseEntity.ok(
                SignUpResponseDTO.builder()
                        .url("/member/login")
                        .build()
        );
    }
}
