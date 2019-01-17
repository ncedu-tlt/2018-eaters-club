package eaters.app;

import eaters.usermodel.UserModel;

public class Main {

    public static void main(String[] args) {
        UserModel userModel = new UserModel();

//        userModel.registerUser("Admin", "Admin", "mail@mail.com", "admin");

        userModel.menu();


//        userModel.displayUsers();

//        System.out.println(userModel.users);
    }
}
