package isogram;

import java.util.Set;
import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        String phrase1 = phrase.replaceAll("\\W", "").toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < phrase1.length(); i++) {
            letters.add(phrase1.charAt(i));
        }

        if (phrase1.length()==letters.size()) {
            return true;}
        else {return false;}
    }
}