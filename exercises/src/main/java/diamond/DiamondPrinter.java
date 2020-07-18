package diamond;

import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {

        List<Character> alphabet = new ArrayList<>();
        List<String> diamond = new ArrayList<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            alphabet.add(c);
        }

        int numberOfLetters = 0;
        for (int i = 0; i < alphabet.size(); i++) {
            if (alphabet.contains(a)) {
                numberOfLetters = i + 1;
            }
        }

        char[] oneLine = new char[numberOfLetters];

        for (int i = 0; i < oneLine.length; i++) {
            oneLine[i] = ' ';
        }

        for (int i = 0; i < numberOfLetters; i++) {
            for (int n = 0; n < numberOfLetters; n++) {
                oneLine[numberOfLetters - n] = alphabet.get(n);
                oneLine[numberOfLetters + n] = alphabet.get(n);
            }
            String oneLineString = new String(oneLine);
            diamond.add(oneLineString);

        }

return diamond;
    }
}
