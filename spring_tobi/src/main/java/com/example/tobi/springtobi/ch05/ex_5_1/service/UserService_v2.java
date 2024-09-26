package com.example.tobi.springtobi.ch05.ex_5_1.service;

import com.example.tobi.springtobi.ch05.ex_5_1.dao.UserDao;
import com.example.tobi.springtobi.ch05.ex_5_1.domain.Level;
import com.example.tobi.springtobi.ch05.ex_5_1.domain.User;

import java.util.List;

public class UserService_v2 {

    public static final int MIN_LOGCOUNT_FOR_SILVER = 50;
<<<<<<< HEAD
    public static final int MAX_LOGCOUNT_FOR_SILVER = 30;
=======
    public static final int MIN_RECCOMMEND_FOR_GOLD = 30;
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9

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

<<<<<<< HEAD
    public void upgradeLevels() {
        List<User> users = userDao.getAll();

        for (User user : users) {
            if (canUpgradeLevels(user)) {
                upgradeLevel(user);

            }

        }
    }
    private boolean canUpgradeLevels(User user) {
=======
    public void upgradelevels() {
        List<User> users = userDao.getAll();

        for (User user : users) {
            if ( canUpgradeLevel(user) ) {
                // upgrade
                upgradeLevel(user);
            }
        }
    }

    private boolean canUpgradeLevel(User user) {
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
        Level currentLevel = user.getLevel();

        switch (currentLevel) {
            case BASIC:
                return (user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER);
            case SILVER:
<<<<<<< HEAD
                return (user.getLogin() >= MAX_LOGCOUNT_FOR_SILVER);
=======
                return (user.getRecommend() >= MIN_RECCOMMEND_FOR_GOLD);
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
            case GOLD:
                return false;
            default:
                throw new IllegalStateException("Unexpected value: " + currentLevel);
<<<<<<< HEAD

        }


=======
        }
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
    }

    private void upgradeLevel(User user) {
        user.upgradeLevel();
        userDao.update(user);
    }

<<<<<<< HEAD
    }

=======
}
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
