package com.chaitanya.passwordgen;

import java.util.Random;

public class Generator {
    public static String generatePassword(String alphabet, int length) {
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            password.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return password.toString();
    }
}
