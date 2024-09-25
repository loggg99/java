package com.example.tobi.springtobi.ch05.ex_5_2.service;

import com.example.tobi.springtobi.ch05.ex_5_2.dao.UserDao;
import com.example.tobi.springtobi.ch05.ex_5_2.domain.Level;
import com.example.tobi.springtobi.ch05.ex_5_2.domain.User;

import java.util.List;

public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
        if (user.getLevel() == null) {
            user.setLevel(Level.BASIC);
        }
        userDao.add(user);
    }

    public void upgradelevels() {
        List<User> users = userDao.getAll();

        for (User user : users) {
            Boolean changed = null;

            if (
                    user.getLevel() == Level.BASIC &&
                            user.getLogin() >= 50
            ) {
                user.setLevel(Level.SILVER);
                changed = true;
            }
            else if (
                    user.getLevel() == Level.SILVER &&
                            user.getRecommend() >= 30
            ) {
                user.setLevel(Level.GOLD);
                changed = true;
            }
            else if ( user.getLevel() == Level.GOLD ) {
                changed = false;
            }
            else {
                changed = false;
            }

            if (changed) {
                userDao.update(user);
            }

        }

    }

}