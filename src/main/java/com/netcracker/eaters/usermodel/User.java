package com.netcracker.eaters.usermodel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int password;
    private String regDate;
    final String[] roles = {"admin", "user"};
    String role;

    public User(String firstName, String lastName, String email, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        role = roles[1];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
        regDate = dateFormat.format(new Date());
    }

    public void displayUserInfo() {
        System.out.println(firstName + "\n" + lastName + "\n" + email);
    }

    public void displayEmail() {
        System.out.println(email);
    }

    public String getEmail(){
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPassword() {
        return password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
