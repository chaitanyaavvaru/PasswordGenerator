package com.chaitanya.passwordgen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void testStrengthScore_Weak() {
        Password password = new Password("abc");
        assertEquals(1, password.strengthScore()); // Only lowercase, <8 length
        assertEquals("Weak", password.getStrengthLabel());
    }

    @Test
    void testStrengthScore_Medium() {
        Password password = new Password("Abc123xy"); // Lower, upper, digit, len >= 8
        assertEquals(4, password.strengthScore());
        assertEquals("Medium", password.getStrengthLabel());
    }

    @Test
    void testStrengthScore_Good() {
        Password password = new Password("abcXYZ123!");
        assertEquals(5, password.strengthScore());
        assertEquals("Good", password.getStrengthLabel());
    }

    @Test
    void testStrengthScore_Great() {
        Password password = new Password("abcXYZ123!@#456789");
        assertEquals(6, password.strengthScore());
        assertEquals("Great", password.getStrengthLabel());
    }

    @Test
    void testGetValue() {
        String input = "StrongPass1!";
        Password password = new Password(input);
        assertEquals(input, password.value());
    }
}
