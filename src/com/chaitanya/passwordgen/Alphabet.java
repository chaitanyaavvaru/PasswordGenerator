package com.chaitanya.passwordgen;

public class Alphabet {
    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+[]{};:<>?/";

    public static String getAlphabet(boolean upper, boolean lower, boolean numbers, boolean symbols) {
        StringBuilder sb = new StringBuilder();
        if (upper) sb.append(UPPER);
        if (lower) sb.append(LOWER);
        if (numbers) sb.append(NUMBERS);
        if (symbols) sb.append(SYMBOLS);
        return sb.toString();
    }
}
