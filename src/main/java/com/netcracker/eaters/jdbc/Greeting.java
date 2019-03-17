package com.netcracker.eaters.jdbc;

public class Greeting {

    private String firstname = "firstname";
    private String lastname = "lastname";
    private String email = "email";
    private String userpassword = "userpassword";

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