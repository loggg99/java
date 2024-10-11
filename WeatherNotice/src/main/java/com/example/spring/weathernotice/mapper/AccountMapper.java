package com.example.spring.weathernotice.mapper;

import com.example.spring.weathernotice.model.Account;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    void register(Account account);
    Account login(String userid, String password);


}
