package eaters.usermodel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    String email = "";
    Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-z]+\\.(com||ru||ua)");

    Scanner input = new Scanner(System.in);
    String command;

    public Email (HashSet users) {

        while (email.equals("")) {
            System.out.println("Email:");
            command = input.nextLine();
            if (command.equals("")) {
                System.out.println("The email can't be void!\n");
            } else {
                Matcher matcher = pattern.matcher(command);
                if (matcher.matches()) {
                    email = checkEmail(command, users);
                } else {
                    System.out.println("The email should be in format: name@domain.ru/com/ua!\n");
                }
            }
        }
    }

    private String checkEmail(String email, HashSet users) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEmail().equals(email)) {
                System.out.println("Specified email already exist!");
                return "";
            }
        }
        return email;
    }
}