package com.example.tobi.springboot_basic_board.controller;

import com.example.tobi.springboot_basic_board.dto.SignUpRequestDTO;
import com.example.tobi.springboot_basic_board.dto.SignUpResponseDTO;
import com.example.tobi.springboot_basic_board.service.MemberService;
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
    public ResponseEntity<SignUpResponseDTO> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO) {
        memberService.signUp(signUpRequestDTO.toMember(bCryptPasswordEncoder));
        return ResponseEntity.ok(
                SignUpResponseDTO.builder()
                        .url("/member/login")
                        .build()
        );
    }

//    @PostMapping("/login")
//    public ResponseEntity<SignInResponseDTO> signIn(@RequestBody SignInRequestDTO signInRequestDTO, HttpSession session) {
//        return ResponseEntity.ok(
//                memberService.signIn(signInRequestDTO.toMember(), session)
//        );
//    }

}
