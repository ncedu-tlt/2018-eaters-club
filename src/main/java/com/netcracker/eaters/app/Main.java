package com.netcracker.eaters.app;

import com.netcracker.eaters.ingredients.DemoManager;
import com.netcracker.eaters.usermodel.UserModel;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        UserModel userModel = new UserModel();
        DemoManager demoManager = new DemoManager();

        Scanner sc = new Scanner(System.in);

        String command;
        Boolean isRunned = true;

        while (isRunned) {
            System.out.println("Choose the functionality to test:\n" +
                    "1. User model\n" +
                    "2. Ingredient\n" +
                    "0. Exit");

            command = sc.nextLine();

            switch (command) {
                case "1":
                    userModel.menu();
                    break;

                case "2":
                    demoManager.menu();
                    break;

                case "0":
                    isRunned = false;
                    break;

                default:
                    break;
            }
        }
    }
}
