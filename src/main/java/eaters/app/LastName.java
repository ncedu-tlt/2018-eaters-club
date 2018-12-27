package eaters.app;

public class LastName {
    String value = null;

    public LastName(String lastName) {
        if (lastName.equals(null)){
            System.out.println("The last name can't be void!\n");
        } else {
            value = lastName;
        }
    }
}