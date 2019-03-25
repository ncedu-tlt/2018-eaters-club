package com.netcracker.eaters;

import com.netcracker.eaters.jdbc.DBUsers;
import com.netcracker.eaters.jdbc.H2DriverManager;
import com.netcracker.eaters.receipts.Rating;
import com.netcracker.eaters.receipts.Recipe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Throwable, SQLException {

        SpringApplication.run(Application.class, args);

        H2DriverManager driverManager = new H2DriverManager();
        Connection connection = driverManager.openH2Connection();

        DBUsers simpleExample = new DBUsers(connection);
        /*simpleExample.selectExample();
        simpleExample.insertExample();
        simpleExample.selectExample();
        simpleExample.updateExample();
        simpleExample.selectExample();
        simpleExample.deleteExample();
        simpleExample.selectExample();
        */
        simpleExample.selectExampleH2();
        //simpleExample.insertExampleH2();


    }
}