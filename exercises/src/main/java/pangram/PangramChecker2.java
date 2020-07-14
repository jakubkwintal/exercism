package pangram;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker2 {

    public boolean isPangram(String input) {

        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Set<Character> lettersOfSentence = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            lettersOfSentence.add(input.charAt(i));
        }

        return (lettersOfSentence.size() == 26);
    }
}