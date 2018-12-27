package eaters.app;

public class Password {
    int value = 0;

    public Password(String password) {
        if (password.equals(null)){
            System.out.println("The password can't be void!\n");
        } else {
            value = password.hashCode();
        }
    }
}