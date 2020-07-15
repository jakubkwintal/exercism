package anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String word;
    private String sortedWord;

    public Anagram(String word) {
        sortedWord = sort(word);
        this.word = word;
    }

    public List<String> match(List<String> listOfWords) {

        List<String> anagramList = new ArrayList<>();

        for (String wordToCheck : listOfWords) {
            if (sortedWord.equals(sort(wordToCheck)) && !word.toLowerCase().equals(wordToCheck.toLowerCase())) {
                anagramList.add(wordToCheck);
            }
        }
        return anagramList;
    }

    private String sort(String word) {
        char[] letters = word.toLowerCase().toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }
}