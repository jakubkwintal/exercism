package twelveDays;

class TwelveDays {

    private String[] day;
    private String[] gift;

    public TwelveDays() {

        this.day = new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        this.gift = new String[]{
                "a Partridge in a Pear Tree.",
                "two Turtle Doves, and ",
                "three French Hens, ",
                "four Calling Birds, ",
                "five Gold Rings, ",
                "six Geese-a-Laying, ",
                "seven Swans-a-Swimming, ",
                "eight Maids-a-Milking, ",
                "nine Ladies Dancing, ",
                "ten Lords-a-Leaping, ",
                "eleven Pipers Piping, ",
                "twelve Drummers Drumming, "
        };
    }

    String verse(int verseNumber) {
        StringBuilder giftsForOneVerse = new StringBuilder();
        for (int i = verseNumber - 1; i >= 0; i--) {
            giftsForOneVerse = giftsForOneVerse.append(gift[i]);
        }
        return "On the " + day[verseNumber - 1] + " day of Christmas my true love gave to me: " + giftsForOneVerse + "\n";
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder fewVerses = new StringBuilder();
        for (int i = startVerse; i <= endVerse; i++) {
            if (i > startVerse) {
                fewVerses.append("\n" + verse(i));
            } else {
                fewVerses.append(verse(i));
            }
        }
        return fewVerses.toString();
    }

    String sing() {
        return verses(1, 12);
    }
}