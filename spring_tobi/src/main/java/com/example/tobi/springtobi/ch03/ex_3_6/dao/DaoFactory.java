package com.example.tobi.springtobi.ch03.ex_3_6.dao;

import com.example.tobi.springtobi.ch03.ex_3_5.dao.JdbcContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao_v1 userDao() {
        return new UserDao_v1(dataSource());
//        return new UserDao(dataSource(), jdbcContext());
    }

    @Bean
    JdbcContext jdbcContext() {

        return new JdbcContext(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_tobi");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        return dataSource;
    }

}