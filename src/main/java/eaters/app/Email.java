package eaters.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    String value = null;
    Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-z]\\.(com||ru||ua)");


    public Email(String email) {
        if (email.equals(null)){
            System.out.println("The email can't be void!\n");
        } else {
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()){
                value = email;
            } else {
                System.out.println("The email should be in format: name@domain.ru/com/ua!\n");
            }
        }
    }
}