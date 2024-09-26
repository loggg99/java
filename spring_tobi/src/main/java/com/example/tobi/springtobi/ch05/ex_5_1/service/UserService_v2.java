package com.example.tobi.springtobi.ch05.ex_5_1.service;

import com.example.tobi.springtobi.ch05.ex_5_1.dao.UserDao;
import com.example.tobi.springtobi.ch05.ex_5_1.domain.Level;
import com.example.tobi.springtobi.ch05.ex_5_1.domain.User;

import java.util.List;

public class UserService_v2 {

    public static final int MIN_LOGCOUNT_FOR_SILVER = 50;
    public static final int MAX_LOGCOUNT_FOR_SILVER = 30;

    private UserDao userDao;

    public UserService_v2(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
        if (user.getLevel() == null) {
            user.setLevel(Level.BASIC);
        }
        userDao.add(user);
    }

    public void upgradeLevels() {
        List<User> users = userDao.getAll();

        for (User user : users) {
            if (canUpgradeLevels(user)) {
                upgradeLevel(user);

            }

        }
    }
    private boolean canUpgradeLevels(User user) {
        Level currentLevel = user.getLevel();

        switch (currentLevel) {
            case BASIC:
                return (user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER);
            case SILVER:
                return (user.getLogin() >= MAX_LOGCOUNT_FOR_SILVER);
            case GOLD:
                return false;
            default:
                throw new IllegalStateException("Unexpected value: " + currentLevel);

        }


    }

    private void upgradeLevel(User user) {
        user.upgradeLevel();
        userDao.update(user);
    }

    }

