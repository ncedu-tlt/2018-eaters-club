package com.netcracker.eaters.usermodel;

import java.util.Scanner;

public class FirstName {
    String firstName = "";

    Scanner input = new Scanner(System.in);
    String command;

    public FirstName() {
        while (firstName.equals("")) {
            System.out.println("First name:");
            command = input.nextLine();
            if (command.equals("")) {
                System.out.println("The name can't be void!\n");
            } else {
                firstName = command;
            }
        }
    }
}