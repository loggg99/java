package com.example.tobi.springtobi.ex_1_4.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class CountingConnectionMaker implements ConnectionMaker {

    int counter = 0;
    private ConnectionMaker RealConnectionMaker;

    public CountingConnectionMaker(ConnectionMaker RealConnectionMaker) {
        this.RealConnectionMaker = RealConnectionMaker;
    }

    @Override
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {

        this.counter++;
        return null;
    }

    public int getCounter() {
        return counter;
    }
}
