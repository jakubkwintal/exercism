package acronym;

class AcronymApp {

    public static void main(String[] args) {
        Acronym acronym = new Acronym("Martyna Krzysia Kwintal");
        acronym.get();
        System.out.println(acronym);
    }

    String phrase;
    String acronym = "";

    public AcronymApp(String phrase) {
        this.phrase = phrase;
    }

    String get() {

        String[] words = phrase.split(" ");

        for (int i = 0; i < words.length; i++) {
            acronym += words[i].charAt(0);
        }
        acronym = acronym.toUpperCase();

        return acronym;
    }

    @Override
    public String toString() {
        return acronym;
    }
}
