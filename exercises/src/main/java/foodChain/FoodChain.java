package foodChain;

public class FoodChain {

    String[] animals = {
            "fly",
            "spider",
            "bird",
            "cat",
            "dog",
            "goat",
            "cow",
            "horse"
    };

    String[] phrase = {
            "",
            "It wriggled and jiggled and tickled inside her.",
            "How absurd to swallow a bird!",
            "Imagine that, to swallow a cat!",
            "What a hog, to swallow a dog!",
            "Just opened her throat and swallowed a goat!",
            "I don't know how she swallowed a cow!",
            "She's dead, of course!"
    };

    String[] afterCatchWord = {
            "fly",
            "spider that wriggled and jiggled and tickled inside her",
            "bird",
            "cat",
            "dog",
            "goat",
            "cow",
            "horse"
    };

    public String verse(int verse) {

        String[] oneVerse = new String[verse + 2];
        StringBuilder sb = new StringBuilder();
        oneVerse[0] = "I know an old lady who swallowed a " + animals[verse - 1] + ".\n";

        if (verse == 1) {
            oneVerse[1] = "I don't know why she swallowed the fly. ";
            oneVerse[2] = "Perhaps she'll die.";

        } else if (verse < 8) {
            oneVerse[1] = phrase[verse - 1] + "\n";
            int numberOfCell = 2;
            for (int i = verse; i > 1; i--) {
                oneVerse[numberOfCell] = "She swallowed the " + animals[i - 1] + " to catch the " + afterCatchWord[i - 2] + ".\n";
                numberOfCell++;
            }
            oneVerse[verse + 1] = "I don't know why she swallowed the fly. Perhaps she'll die.";

        } else {
            oneVerse = new String[2];
            oneVerse[0] = "I know an old lady who swallowed a " + animals[verse - 1] + ".\n";
            oneVerse[1] = phrase[verse - 1];
        }

        int n = 0;
        while (n < oneVerse.length) {
            sb.append(oneVerse[n]);
            n++;
        }
        return sb.toString();
    }


    public String verses(int startVerse, int endVerse) {

        StringBuilder sb = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            sb.append(verse(i)).append("\n").append("\n");
        }
        return sb.deleteCharAt(sb.length() - 2).deleteCharAt(sb.length() - 1).toString();
    }
}