package anagram;

class Anagram {
    void detector(String word) {
        String[] letters = word.split("");
        int count = 0;
        for (int i = 0; i < letters.length; i++) {
            if (word.contains(letters[i])) {
                count++;
            }
        }
        if (count == letters.length) {
            System.out.println("To jest anagram.");
        } else {
            System.out.println("To nie jest anagram.");
        }
    }
}