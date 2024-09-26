package com.example.tobi.springtobi.ch05.ex_5_2.dao;

import com.example.tobi.springtobi.ch05.ex_5_2.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.transaction.PlatformTransactionManager;
=======
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9

import javax.sql.DataSource;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDaoJdbc(dataSource());
    }

    @Bean
    public UserService userService() {
        return new UserService(userDao());
    }

    @Bean
<<<<<<< HEAD
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
=======
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_tobi");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");

        return dataSource;
    }

}