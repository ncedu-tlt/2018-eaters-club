package eaters.app;

public class Main {

    public static void main(String[] args) {
        UserModel userModel = new UserModel();

//        userModel.registerUser("Admin", "Admin", "mail@mail.com", "admin");
//        Проверяем существование файла с данными о пользователях
        if(userModel.checkFile()){
            userModel.loadUsers();
        }
        userModel.menu();


//        userModel.displayUsers();

//        System.out.println(userModel.users);
    }
}
