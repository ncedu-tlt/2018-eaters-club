package eaters.usermodel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class UserModel {
    public HashSet users = new HashSet<User>();
    private String path = "users.json";
    private File file = new File(path);

    Scanner input = new Scanner(System.in);

    String command;

    public UserModel() {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEmail().equals("admin")) {
                return;
            }
            final User admin = new User("Admin", "Admin", "admin", "admin".hashCode());
            admin.role = admin.roles[0];
            saveUsers();
        }

//        Загружаем данные при инициализации экземпляра класса
        if (checkFile()) {
            loadUsers();
        }
    }
    //        Проверяем существование файла с данными о пользователях
    private Boolean checkFile() {
        return (file.exists());
    }

    public void menu() {
        int activeMenu = 1;

        while (activeMenu > 0) {

            switch (activeMenu) {

                case 1:
                    System.out.println("Choose the role:\n1-User\n2-Admin\n0-exit\n");
                    command = input.nextLine();

                    switch (command) {
                        case "1":
                            activeMenu = 2;
                            break;

                        case "2":
                            activeMenu = 3;
                            break;

                        case "0":
                            activeMenu = 0;
                            break;

                        default:
                            break;
                    }
                    break;

                case 2:
                    System.out.println("User role demo\n\nChoose the option:\n1-Register new user\n2-Sign in\n3-Back to Main menu\n0-exit\n");
                    command = input.nextLine();

                    switch (command) {
                        case "1":
                            registerUser();
                            break;

                        case "2":
                            break;

                        case "3":
                            activeMenu = 1;
                            break;

                        case "0":
                            activeMenu = 0;
                            break;

                        default:
                            break;
                    }

                    break;

                case 3:
                    System.out.println("Admin role demo\n\nChoose the option:\n1-Register new user\n2-Edit user data\n3-Remove user\n4-Back to Main menu\n0-exit\n");
                    command = input.nextLine();

                    switch (command) {
                        case "1":
                            registerUser();
                            break;

                        case "2":
                            editUser();
                            break;

                        case "3":
                            removeUser();
                            break;

                        case "4":
                            activeMenu = 1;
                            break;

                        case "0":
                            activeMenu = 0;
                            break;

                        default:
                            break;
                    }
                    break;
            }
        }
    }

    //            Загружаем данные из файла в память
    public void loadUsers() {
        try {
//            Читаем json в строку
            BufferedReader br = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();

            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            String text = sb.toString();

//            Десерриализуем json массив в объект и записываем в коллекцию
            Gson gson = new GsonBuilder().setLenient().create();
            Type type = new TypeToken<List<User>>() {
            }.getType();

            List<User> read = gson.fromJson(text, type);
            users.addAll(read);

            br.close();

        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }

    public void registerUser() {
        String firstName;
        String lastName;
        String email;
        int password;

        email = new Email(users).email;
        firstName = new FirstName().firstName;
        lastName = new LastName().lastName;
        password = new Password().password;

        users.add(new User(firstName, lastName, email, password));
        saveUsers();
        System.out.println("Account: " + email + " successfully created! Press any key to continue...");
        command = input.nextLine();
    }

    public void editUser() {
        Iterator<User> iterator = users.iterator();
        User currentUser;
        User backupUser;

        System.out.println("Please choose the account to edit:");
        displayAccounts();
        command = input.nextLine();

        while (iterator.hasNext()) {
            currentUser = iterator.next();
            if (currentUser.getEmail().equals(command)) {
                backupUser = currentUser;
                System.out.println("Check info:");
                currentUser.displayUserInfo();

                int isRunned = 1;

                while (isRunned == 1) {
                    System.out.println("What you want to change? 1-First name 2-Last name 3-Email 4-Password");
                    command = input.nextLine();
                    switch (command) {
                        case "1":
                            currentUser.setFirstName(new FirstName().firstName);

                            System.out.println("Confirm the action: y/n");
                            currentUser.displayUserInfo();
                            command = input.nextLine();

                            switch (command) {
                                case "y":
                                    System.out.println("Done. Press any key to continue...");
                                    command = input.nextLine();
                                    isRunned = 0;
                                    break;

                                case "n":
                                    currentUser.setFirstName(backupUser.getFirstName());
                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "2":
                            currentUser.setLastName(new LastName().lastName);

                            System.out.println("Confirm the action: y/n");
                            currentUser.displayUserInfo();
                            command = input.nextLine();

                            switch (command) {
                                case "y":
                                    System.out.println("Done. Press any key to continue...");
                                    command = input.nextLine();
                                    isRunned = 0;
                                    break;

                                case "n":
                                    currentUser.setLastName(backupUser.getLastName());
                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "3":
                            currentUser.setEmail(new Email(users).email);

                            System.out.println("Confirm the action: y/n");
                            currentUser.displayUserInfo();
                            command = input.nextLine();

                            switch (command) {
                                case "y":
                                    System.out.println("Done. Press any key to continue...");
                                    command = input.nextLine();
                                    isRunned = 0;
                                    break;

                                case "n":
                                    currentUser.setEmail(backupUser.getEmail());
                                    break;

                                default:
                                    break;
                            }
                            break;
                        case "4":
                            currentUser.setPassword(new Password().password);
                            System.out.println("Done. Press any key to continue...");
                            isRunned = 0;
                            break;

                        default:
                            break;
                    }
                }
                iterator.remove();
                users.add(currentUser);
                saveUsers();
                return;
            }
        }
        System.out.println("Specified account is not exist!");
    }


    public void removeUser() {
        System.out.println("Please choose the account to delete:");
        displayAccounts();
        command = input.nextLine();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEmail().equals(command)) {
                iterator.remove();
                System.out.println(command + " has been deleted");
                saveUsers();
                break;
            }
        }
        System.out.println("Specified account is not exist!");
    }

    public void saveUsers() {
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(file));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            printStream.print(gson.toJson(users));
            printStream.close();
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
    }

    public void displayAccounts() {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            iterator.next().displayEmail();
        }
        System.out.println();
    }
}

