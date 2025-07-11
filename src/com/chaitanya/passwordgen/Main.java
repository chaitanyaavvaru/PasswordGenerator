package com.chaitanya.passwordgen;

public class Main {
    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Usage: java Main <useUpper:yes/no> <useLower:yes/no> <useNumbers:yes/no> <useSymbols:yes/no> <length:int>");
        }

        boolean useUpper = args[0].equalsIgnoreCase("yes");
        boolean useLower = args[1].equalsIgnoreCase("yes");
        boolean useNumbers = args[2].equalsIgnoreCase("yes");
        boolean useSymbols = args[3].equalsIgnoreCase("yes");
        int length;

        try {
            length = Integer.parseInt(args[4]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid password length: " + args[4]);
            return;
        }

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
