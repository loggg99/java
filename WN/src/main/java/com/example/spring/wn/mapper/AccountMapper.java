package com.example.spring.wn.mapper;

import com.example.spring.wn.model.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    void register(Account account);
    Account login(String id, String password);


}
