package org.example;

import org.example.StringValidate;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringValidateTest {
    private StringValidate stringCheck = new StringValidate();

    @Test
    public void isStringValid() {
        String input = "ABCxyz123@";
        assertEquals(true, stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringNull() {
        String input = null;
        assertEquals(false,stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringEmpty() {
        String input = "";
        assertEquals(false,stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringShort() {
        String input = "Abc123";
        assertEquals(false,stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringNoUpperCase() {
        String input = "abc123xyz!";
        assertEquals(false,stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringNoLowerCase() {
        String input = "ABC123XYZ!";
        assertEquals(false,stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringNoDigitNumber() {
        String input = "ABCDEFXYZ!";
        assertEquals(false,stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringNoSpecialChar() {
        String input = "ABC123XYZZZ";
        assertEquals(false,stringCheck.isStringValidation(input));
    }

    @Test
    public void isStringHasWhiteSpace() {
        String input = "  ABCxyz123@   ";
        assertEquals(true, stringCheck.isStringValidation(input));
    }

}
