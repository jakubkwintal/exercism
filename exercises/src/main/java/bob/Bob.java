package bob;

import java.util.regex.Pattern;

public class Bob {

    private static boolean isUpperCase(String input) {
        char[] inputArray = input.toCharArray();

        for (char c : inputArray) {
            if (Character.isLetter(c)) {
                if (!Character.isUpperCase(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String hey(String input) {

        String finalInput = input.replaceAll("\\s", "");

        if (finalInput.isEmpty()) {
            return "Fine. Be that way!";
        } else if (isUpperCase(finalInput) && Pattern.compile("[a-zA-Z]").matcher(finalInput).find()) {
            if (!finalInput.endsWith("?")) {
            return "Whoa, chill out!";}
            else {return "Calm down, I know what I'm doing!";}
        } else if (finalInput.endsWith("?")) {
            return "Sure.";
        } else {
            return "Whatever.";
        }
    }
}
