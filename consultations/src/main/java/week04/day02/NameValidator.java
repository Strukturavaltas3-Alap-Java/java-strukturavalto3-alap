package week04.day02;

import java.util.Locale;

public class NameValidator {

    public boolean isValidName(String name) {
        String[] parts = name.split(" ");
        if (!checkNumberOfParts(parts)) {
            return false;
        }

        return checkFirstLettersOfParts(parts);
    }


    private boolean checkNumberOfParts(String[] parts) {
        return parts.length >= 2;
    }

    private boolean checkFirstLettersOfParts(String[] parts) {
        for (String part : parts) {
            if (part.toLowerCase().charAt(0) == part.charAt(0)) {
                return false;
            }
        }
        return true;
    }
}
