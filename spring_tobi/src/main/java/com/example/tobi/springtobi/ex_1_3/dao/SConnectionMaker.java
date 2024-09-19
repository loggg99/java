package com.example.tobi.springtobi.ex_1_3.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class SConnectionMaker implements ConnectionMaker{
    @Override
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
