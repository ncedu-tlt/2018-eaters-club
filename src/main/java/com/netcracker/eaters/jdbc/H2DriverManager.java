package com.netcracker.eaters.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class H2DriverManager {

    public Connection openH2Connection() {
        try {
            Driver driver = createH2Driver();
            DriverManager.registerDriver(driver);

            Properties properties = loadProperties();
            Connection connection = getConnection(properties);

            return connection;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Driver createH2Driver() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Driver) Class.forName("org.h2.Driver").newInstance();
    }

    private Properties loadProperties() {

        Properties properties = new Properties();
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("h2.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return properties;
    }

    private Connection getConnection(Properties properties) {
        try {
            return DriverManager.getConnection(properties.getProperty("url"), properties);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
