package eaters.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int password;
    private String regDate;

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = new FirstName(firstName).value;
        this.lastName = new LastName(lastName).value;
        this.email = new Email(email).value;
        this.password = new Password(password).value;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY");
        regDate = dateFormat.format(new Date());
    }

    public void displayUserInfo() {
        System.out.println(firstName + "\n" + lastName + "\n" + email + "\n" + password + "\n" + regDate + "\n");
    }
}
