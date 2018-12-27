package eaters.app;

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

    public Boolean checkFile() {
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
                    System.out.println("User role demo\n\nChoose the option:\n1-Register\n2-Sign in\n3-Back to Main menu\n0-exit\n");
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
            }
        }
    }

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
        String firstName = null;
        String lastName = null;
        String email = null;
        String password = null;

        while (firstName.equals(null)){
            System.out.println("First name:");
            firstName = new FirstName(command).value;
        }

        users.add(new User(firstName, lastName, email, password));
        saveUsers();
    }

    public void editUser() {

    }

    public void removeUser() {

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

    public void displayUsers() {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            iterator.next().displayUserInfo();
        }
    }
}
