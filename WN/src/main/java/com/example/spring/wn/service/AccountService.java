package com.example.spring.wn.service;

import com.example.spring.wn.dto.LoginDTO;
import com.example.spring.wn.mapper.AccountMapper;
import com.example.spring.wn.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AccountService {

    private final AccountMapper accountMapper;


    public void register(Account account) {

        accountMapper.register(account);
    }

    public Account login(LoginDTO loginDTO) {
        return accountMapper.login(loginDTO.getUserId(), loginDTO.getPassword());
    }



}
