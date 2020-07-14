package pangram;

public class PangramChecker {

    public boolean isPangram(String input) {

        for (char i = 'a'; i <= 'z'; i++) {
            if (input.indexOf(i) < 0) {
                return false;
            } else {
                continue;
            }
        }
        return false;
    }
}