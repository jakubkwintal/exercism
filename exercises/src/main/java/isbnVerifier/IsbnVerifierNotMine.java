package isbnVerifier;

class IsbnVerifierNotMine {

    boolean isValid(String stringToVerify) {
        int total = 0;
        int count = 10;
        for (char numChar : stringToVerify.toCharArray()) {
            if (numChar == '-') {
                continue;
            }
            if (Character.isDigit(numChar)) {
                total += (numChar - '0') * (count--);
            } else if (numChar == 'X' && count == 1) {
                total += 10 * (count--);
            } else {
                return false;
            }
        }

        return count == 0 && total % 11 == 0;
    }
}