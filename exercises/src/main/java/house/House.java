package house;

public class House {

    String[] firstPartOfLine = {
            "that lay in",
            "that ate",
            "that killed",
            "that worried",
            "that tossed",
            "that milked",
            "that kissed",
            "that married",
            "that woke",
            "that kept",
            "that belonged to"};

    String[] secondPartOfLine = {
            "the house that Jack built.",
            "the malt",
            "the rat",
            "the cat",
            "the dog",
            "the cow with the crumpled horn",
            "the maiden all forlorn",
            "the man all tattered and torn",
            "the priest all shaven and shorn",
            "the rooster that crowed in the morn",
            "the farmer sowing his corn",
            "the horse and the hound and the horn"};

    public String verse(int verseNumber) {

        StringBuilder oneVerse = new StringBuilder("This is " + secondPartOfLine[verseNumber - 1]);

        for (int i = verseNumber - 1; i > 0; i--) {
            oneVerse.append(" ").append(firstPartOfLine[i - 1]).append(" ").append(secondPartOfLine[i - 1]);
        }
        return oneVerse.toString();
    }


    public String verses(int startVerse, int endVerse) {
        StringBuilder verses = new StringBuilder();

        for (int i = startVerse; i <= endVerse; i++) {
            verses.append(verse(i)).append("\n");
        }
        return verses.deleteCharAt(verses.length() - 1).toString();
    }


    public String sing() {
        return verses(1, secondPartOfLine.length);
    }
}
