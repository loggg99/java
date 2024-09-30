package com.example.tobi.springtobi.ch05.ex_5_1.dao;

<<<<<<< HEAD
import com.example.tobi.springtobi.ch03.ex_3_5.dao.JdbcContext;
import com.example.tobi.springtobi.ch05.ex_5_1.service.UserService_v1;
=======
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
import com.example.tobi.springtobi.ch05.ex_5_1.service.UserService_v2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;

@Configuration
public class DaoFactory {

    @Bean
    public UserDao userDao() {
        return new UserDaoJdbc(dataSource());
<<<<<<< HEAD
//        return new UserDao(dataSource(), jdbcContext());
=======
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
    }

    @Bean
    public UserService_v2 userService() {
        return new UserService_v2(userDao());
    }

<<<<<<< HEAD

=======
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
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