package eaters.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

public class UserModel {
    HashSet users = new HashSet<User>();

    public void loadUsers() {

    }

    public void registerUser(String firstName, String lastName, String email, String password) {
        User currentUser = new User(firstName, lastName, email, password);
        users.add(currentUser);
        saveUsers();
    }

    public void editUser() {

    }

    public void removeUser() {

    }

    public void saveUsers() {
        String path = "users.json";
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(path));
            Gson gson = new Gson();

            printStream.print(gson.toJson(users));
            printStream.close();
        }
        catch (Exception e){
            System.out.println("Error:" + e);
        }
    }

    public void displayUsers() {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            iterator.next().displayUserInfo();
        }
    }
}
