package com.example.spring.weathernotice.service;

import com.example.spring.weathernotice.dto.LoginDTO;
import com.example.spring.weathernotice.mapper.AccountMapper;
import com.example.spring.weathernotice.model.Account;
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
        return accountMapper.login(loginDTO.getUserid(), loginDTO.getPassword());
    }



}
