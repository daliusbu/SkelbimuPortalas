package com.kcs.auto.adverts.service.impl;

import com.kcs.auto.adverts.service.ConnectionServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by dalius on 2017.03.09.
 */
public class ConnectionServiceImpl implements ConnectionServices {

    private static final String URL = "jdbc:mysql://localhost:3306/auto_adverts";
    private static final String NAME = "root";

    @Override
    public Connection createConnection() {
       setJdbcClassDriver();
       Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, NAME,"");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    private void setJdbcClassDriver(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
