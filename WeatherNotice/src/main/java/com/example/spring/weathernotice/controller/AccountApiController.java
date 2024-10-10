package com.example.spring.weathernotice.controller;

import com.example.spring.weathernotice.dto.LoginDTO;
import com.example.spring.weathernotice.dto.RegisterDTO;
import com.example.spring.weathernotice.model.Account;
import com.example.spring.weathernotice.service.AccountService;
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
        Account account = Account.builder()
                .userId(registerDTO.getUserId())
                .password(registerDTO.getPassword())
                .userName(registerDTO.getUserName())
                .build();

        accountService.register(account);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/api/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginDTO loginDTO) {
        Account account = accountService.login(loginDTO);

        if (account != null) {
            return ResponseEntity.ok("success");
        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("fail");
        }
    }



}
