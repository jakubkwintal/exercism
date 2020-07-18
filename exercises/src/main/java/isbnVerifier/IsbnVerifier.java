package isbnVerifier;

import java.util.regex.Pattern;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        stringToVerify = stringToVerify.replaceAll("-", "").toLowerCase();
        String[] isbn = stringToVerify.split("");

        if (isbn.length != 10) {
            return false;
        }

        Pattern pattern = Pattern.compile("\\d");
        for (int i = 0; i < isbn.length - 1; i++) {
            if (!isbn[i].matches(String.valueOf(pattern))) {
                return false;
            }
        }

        if (!isbn[9].matches(String.valueOf(pattern)) && (!isbn[9].equals("x"))) {
            return false;
        }

        if (isbn[9].equals("x")) {
            isbn[9] = "10";
        }

        int[] isbnTable = new int[isbn.length];
        for (int i = 0; i < isbn.length; i++) {
            isbnTable[i] = Integer.parseInt(isbn[i]);
        }

        int isbnOperation = 0;
        for (int i = 0; i < 10; i++) {
            isbnOperation += isbnTable[i] * (10 - i);
        }
        return isbnOperation % 11 == 0;
    }
}
