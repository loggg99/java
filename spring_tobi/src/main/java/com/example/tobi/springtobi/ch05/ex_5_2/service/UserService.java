package com.example.tobi.springtobi.ch05.ex_5_2.service;

import com.example.tobi.springtobi.ch05.ex_5_2.dao.UserDao;
import com.example.tobi.springtobi.ch05.ex_5_2.domain.Level;
import com.example.tobi.springtobi.ch05.ex_5_2.domain.User;
<<<<<<< HEAD
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
=======

>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
import java.util.List;

public class UserService {

<<<<<<< HEAD
    public static final int MIN_LOGCOUNT_FOR_SILVER = 50;
    public static final int MIN_RECCOMMEND_FOR_GOLD = 30;

    private DataSource dataSource;
    private UserDao userDao;

    public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    private PlatformTransactionManager transactionManager;

    public UserService(String id) {}

=======
    private UserDao userDao;

>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

<<<<<<< HEAD
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

=======
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9
    public void add(User user) {
        if (user.getLevel() == null) {
            user.setLevel(Level.BASIC);
        }
        userDao.add(user);
    }

    public void upgradelevels() {
        List<User> users = userDao.getAll();

        for (User user : users) {
<<<<<<< HEAD
            if ( canUpgradeLevel(user) ) {
                // upgrade
                upgradeLevel(user);
            }
        }
    }

    public void upgradelevelsV2() throws SQLException {

        TransactionSynchronizationManager.initSynchronization();
        Connection c = DataSourceUtils.getConnection(dataSource);

        c.setAutoCommit(false);

        try {
            List<User> users = userDao.getAll();

            for (User user : users) {
                if ( canUpgradeLevel(user) ) {
                    // upgrade
                    upgradeLevel(user);
                }
            }
            c.commit();
        } catch (Exception e) {
            c.rollback();
            throw e;
        } finally {
            DataSourceUtils.releaseConnection(c, dataSource);
            TransactionSynchronizationManager.unbindResource(dataSource);
            TransactionSynchronizationManager.clearSynchronization();
        }

    }

    public void upgradelevelsV3() throws SQLException {

        PlatformTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());

        try {
            List<User> users = userDao.getAll();

            for (User user : users) {
                if ( canUpgradeLevel(user) ) {
                    // upgrade
                    upgradeLevel(user);
                }
            }
            transactionManager.commit(status);
        } catch (Exception e) {
            transactionManager.rollback(status);
            throw e;
        }

    }

    public void upgradelevelsV4() throws SQLException {

        TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());

        try {
            List<User> users = userDao.getAll();

            for (User user : users) {
                if ( canUpgradeLevel(user) ) {
                    // upgrade
                    upgradeLevel(user);
                }
            }
            transactionManager.commit(status);
        } catch (Exception e) {
            transactionManager.rollback(status);
            throw e;
        }

    }

    private boolean canUpgradeLevel(User user) {
        Level currentLevel = user.getLevel();

        switch (currentLevel) {
            case BASIC:
                return (user.getLogin() >= MIN_LOGCOUNT_FOR_SILVER);
            case SILVER:
                return (user.getRecommend() >= MIN_RECCOMMEND_FOR_GOLD);
            case GOLD:
                return false;
            default:
                throw new IllegalStateException("Unexpected value: " + currentLevel);
        }
    }

    protected void upgradeLevel(User user) {
        user.upgradeLevel();
        userDao.update(user);
    }

    static class TestUserService extends UserService {

        private String id;

        public TestUserService(String id) {
            super(id);
            this.id = id;
        }

        @Override
        protected void upgradeLevel(User user) {
            if ( user.getId().equals(id) ) {
                throw new TestUserServiceException();
            }
            super.upgradeLevel(user);
        }
    }

    static class TestUserServiceException extends RuntimeException {}
=======
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
>>>>>>> f1422ac4b906504c4f73581eb1f6d2d8c51618d9

}