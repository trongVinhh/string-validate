package org.example;

public class StringValidate {
    public StringValidate() {
    }

    final String specialCharacters = "[!@#$%^&*(),.?\":{}|<>]";
    public boolean isStringValidation(String input) {

        if (input == null) {
            return false;
        }

        if (input.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        boolean hasSpaceChar = false;

        for (char i : input.toCharArray()) {
            if (Character.isLowerCase(i)) {
                hasLowerCase= true;
            }
            if (Character.isUpperCase(i)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(i)) {
                hasDigit = true;
            }
            if (Character.isWhitespace(i)) {
                hasSpaceChar = true;
            }
            if (specialCharacters.contains(String.valueOf(i))) {
                hasSpecialChar = true;
            }

        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

    }

}
