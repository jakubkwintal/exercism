package acronym;

class Acronym {

    String phrase;
    String acronym = "";

    public Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {

        phrase = phrase.replaceAll("-", " ").toUpperCase();
        phrase = phrase.replaceAll("[^A-Z ]", "");
        phrase = phrase.replaceAll("(   )", " ");

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            acronym += words[i].charAt(0);
        }
        return acronym;
    }

    @Override
    public String toString() {
        return acronym;
    }
}
