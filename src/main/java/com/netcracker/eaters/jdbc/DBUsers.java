package com.netcracker.eaters.jdbc;

import java.sql.*;

public class DBUsers {

    private String firstname = "firstname";
    private String lastname = "lastname";
    private String email = "email";
    private String userpassword = "userpassword";

    public void selectExampleH2() throws SQLException {
        H2DriverManager driverManager = new H2DriverManager();
        Connection connection = driverManager.openH2Connection();

        String query = "SELECT * FROM users";
        Statement stmt = connection.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);
        while (resultSet.next()) {
            String user_first_name = resultSet.getString("first_name");
            String user_last_name = resultSet.getString("last_name");
            String user_email = resultSet.getString("email");
            System.out.println(String.format("User [%s, %s, %s]", user_first_name, user_last_name, user_email));
        }
        System.out.println("--- ALL ROWS ARE FETCHED ---");
    }

    public void insertExampleH2(Connection connection) throws SQLException {
        String query = "INSERT INTO users (first_name, last_name, email, password) VALUES (?, ?, ?, ?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, "user1");
        preparedStatement.setString(2, "user1");
        preparedStatement.setString(3, "user1@test.com");
        preparedStatement.setString(4, "user1");



        preparedStatement.execute();
        System.out.println("--- INSERTED 1 ROW ---");
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }
}
