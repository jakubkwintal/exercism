package microBlog;

public class App {
    public static void main(String[] args) {

        App app = new App();

        app.truncate("Zawodowiec");
    }

    public String truncate(String input) {

        int[] inputCodePoints = input.codePoints().toArray();

        for(int string : inputCodePoints) {
            System.out.println(string);
        }

        if (inputCodePoints.length < 6) {
        } else {
            return new String(inputCodePoints, 0, 5); //zamiana tablicy na Stringa
        }
        return input;
    }
}
