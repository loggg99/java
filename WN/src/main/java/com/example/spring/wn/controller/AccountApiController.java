package com.example.spring.wn.controller;

import com.example.spring.wn.dto.LoginDTO;
import com.example.spring.wn.dto.RegisterDTO;
import com.example.spring.wn.model.Account;
import com.example.spring.wn.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountApiController {

    private final AccountService accountService;

    @PostMapping("/api/register")
    public ResponseEntity<Object> registerUser(@RequestBody RegisterDTO registerDTO) {
        System.out.println("RegisterDTO: " + registerDTO);  // 디버깅용 로그

        Account account = Account.builder()
                .userid(registerDTO.getUserid())
                .password(registerDTO.getPassword())
                .username(registerDTO.getUsername())
                .build();

        accountService.register(account);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @PostMapping("/api/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginDTO loginDTO) {
        Account account = accountService.login(loginDTO);

        if (account != null) {
            return ResponseEntity.ok("success");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("fail");
        }
    }

}

