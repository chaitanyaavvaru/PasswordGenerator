package com.chaitanya.passwordgen;

public class GeneratorTest {
    public static void main(String[] args) {
        String alphabet = Alphabet.getAlphabet(true, true, true, true);
        String password = Generator.generatePassword(alphabet, 12);
        System.out.println("Generated Password: " + password);
    }
}

