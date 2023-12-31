package com.example.demo1.services;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConn {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Hello_123";
    private static final String DATABASE_NAME = "customer_db";
    private static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";

    private static HikariDataSource dataSource;


    // Private constructor to prevent direct instantiation
    private DBConn() {
    }

    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            initializeDataSource();}

        return dataSource.getConnection();
    }

    public static void close() {
        if (dataSource != null) {
            dataSource.close();
        }
    }

    private static void initializeDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(URL + DATABASE_NAME);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        config.setDriverClassName(DRIVER_CLASS_NAME);
        config.setMaximumPoolSize(10);
        dataSource = new HikariDataSource(config);
    }
}
