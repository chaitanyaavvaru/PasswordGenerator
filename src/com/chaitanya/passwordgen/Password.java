package com.chaitanya.passwordgen;

public class Password {
    private final String value;

    public Password(String value) {
        this.value = value;
    }

    public int strengthScore() {
        int score = 0;
        if (value.matches(".*[A-Z].*")) score++;  // Uppercase
        if (value.matches(".*[a-z].*")) score++;  // Lowercase
        if (value.matches(".*[0-9].*")) score++;  // Numbers
        if (value.matches(".*[!@#$%^&*()\\-_=+\\[\\]{};:<>?/\\\\|~`\"'].*")) score++;
        if (value.length() >= 8) score++;         // Length ≥ 8
        if (value.length() >= 16) score++;        // Length ≥ 16
        return score;
    }

    public String getStrengthLabel() {
        int score = strengthScore();
        if (score <= 2) return "Weak";
        else if (score <= 4) return "Medium";
        else if (score == 5) return "Good";
        else return "Great";
    }

    public String getValue(){
        return value;
    }

    public String value() {
        return value;
    }
}
