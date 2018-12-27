package eaters.app;

public class FirstName {
    String value = null;

    public FirstName(String firstName) {
        if (firstName.equals(null)){
            System.out.println("The name can't be void!\n");
        } else {
            value = firstName;
        }
    }
}
