package com.example.tobi.springtobi.ch05.ex_5_2.dao;

import com.example.tobi.springtobi.ch05.ex_5_2.domain.User;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.List;

public interface UserDao {

=======
import java.util.List;

public interface UserDao {
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
    void add(User user);
    void deleteAll();
    List<User> getAll();
    User get(String id);
<<<<<<< HEAD
    int getCount() throws SQLException;
    void update(User user);
}
=======
    int getCount();
    void update(User user);
}
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
