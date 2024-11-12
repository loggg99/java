package com.example.tobi.springsecuritytasha.controller;

import com.example.tobi.springsecuritytasha.dto.SignInRequestDTO;
import com.example.tobi.springsecuritytasha.dto.SignInResponseDTO;
import com.example.tobi.springsecuritytasha.dto.SignUpRequestDTO;
import com.example.tobi.springsecuritytasha.dto.SignUpResponseDTO;
import com.example.tobi.springsecuritytasha.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/join")
    public ResponseEntity<SignUpResponseDTO> signUp(
            @RequestBody SignUpRequestDTO signUpRequestDTO) {
        memberService.signUp(signUpRequestDTO.toMember(bCryptPasswordEncoder));
        return ResponseEntity.ok(
                SignUpResponseDTO.builder()
                        .url("/member/login")
                        .build()
        );
    }



}
