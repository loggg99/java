package com.example.spring.weathernotice.controller;

import com.example.spring.weathernotice.dto.LoginDTO;
import com.example.spring.weathernotice.dto.RegisterDTO;
import com.example.spring.weathernotice.model.Account;
import com.example.spring.weathernotice.service.AccountService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class AccountApiController {

    private final AccountService accountService;

    @PostMapping("/api/register")
    public ResponseEntity<Object> registerUser(@RequestBody RegisterDTO registerDTO) {
        System.out.println("RegisterDTO: " + registerDTO);

        Account account = Account.builder()
                .userid(registerDTO.getUserid())
                .password(registerDTO.getPassword())
                .username(registerDTO.getUsername())

                .userId(registerDTO.getUser_id())
                .password(registerDTO.getPassword())
                .userName(registerDTO.getUser_name())

                .build();

        accountService.register(account);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/api/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginDTO loginDTO, HttpSession session) {
        Account account = accountService.login(loginDTO);

        if (account != null) {
            session.setAttribute("account", account.getUsername());
            return ResponseEntity.ok("success");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("fail");
        }
    }


    @GetMapping("/api/getUsername")
    public ResponseEntity<Map<String, String>> getUsername(HttpSession session) {
        String username = (String) session.getAttribute("account");  // 세션에서 사용자 이름 가져오기
        if (username != null) {
            Map<String, String> response = new HashMap<>();
            response.put("username", username);  // 사용자 이름을 JSON 형태로 반환
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();  // 로그인하지 않은 경우
        }
    }





=======
>>>>>>> 2ab4e023df6867cd976f8545a4bb64c0cb52043d
}

