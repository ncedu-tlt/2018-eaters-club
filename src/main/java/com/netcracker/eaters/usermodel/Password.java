package com.netcracker.eaters.usermodel;

import java.util.Scanner;

public class Password {
    int password = 0;

    Scanner input = new Scanner(System.in);
    String command;

    public Password() {

        while (password == 0) {
            System.out.println("Password:");
            command = input.nextLine();
            if (command.equals("")) {
                System.out.println("The password can't be void!\n");
            } else {
                password = command.hashCode();
            }
        }
    }

    public void changePassword(){

    }

    private boolean checkPassword(User user){
        return user.getPassword() == password;
    }
}