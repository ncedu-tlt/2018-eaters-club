package eaters.app;

public class Main {

    public static void main(String[] args) {
        UserModel userModel = new UserModel();
        userModel.registerUser("Иван", "Иванов", "ololo@mail.ru", "ololo");

        userModel.displayUsers();
    }
}
