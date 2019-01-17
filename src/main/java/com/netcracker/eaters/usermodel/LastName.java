package com.netcracker.eaters.usermodel;

import java.util.Scanner;

public class LastName {
    String lastName = "";

    Scanner input = new Scanner(System.in);
    String command;

    public LastName() {
        while (lastName.equals("")) {
            System.out.println("Last name:");
            command = input.nextLine();
            if (command.equals("")) {
                System.out.println("The name can't be void!\n");
            } else {
                lastName = command;
            }
        }
    }
}