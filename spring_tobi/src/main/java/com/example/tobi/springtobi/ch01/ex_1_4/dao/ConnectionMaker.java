package com.example.tobi.springtobi.ch01.ex_1_4.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection makeNewConnection() throws ClassNotFoundException, SQLException;
}