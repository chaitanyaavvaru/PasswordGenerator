package com.chaitanya.passwordgen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Include uppercase letters? (yes/no)");
        boolean useUpper = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Include lowercase letters? (yes/no)");
        boolean useLower = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Include numbers? (yes/no)");
        boolean useNumbers = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Include symbols? (yes/no)");
        boolean useSymbols = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Enter desired password length:");
        int length = scanner.nextInt();

        String alphabet = Alphabet.getAlphabet(useUpper, useLower, useNumbers, useSymbols);
        if (alphabet.isEmpty()) {
            System.out.println("No character types selected. Cannot generate password.");
            return;
        }

        String passwordStr = Generator.generatePassword(alphabet, length);
        Password password = new Password(passwordStr);

        System.out.println("\nGenerated Password: " + password.value());
        System.out.println("Password Strength: " + password.getStrengthLabel());
    }
}
