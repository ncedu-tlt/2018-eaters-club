package eaters.app;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Password {
    int value;

    public Password(String password) {
        value = password.hashCode();
    }
}
