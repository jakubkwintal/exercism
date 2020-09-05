package romanNumerals;

public class RomanNumerals {

    private static int number;

    public RomanNumerals(int number) {
        this.number = number;
        String num = String.valueOf(number);
        if (num.length() > 4) {
            throw new IllegalArgumentException("Enter a number up to four digits.");
        }
    }

    public String getRomanNumerals() {
        StringBuilder sb = new StringBuilder();

        for (Roman roman : Roman.values()) {
            while (number >= roman.getNumber()) {
                number -= roman.getNumber();
                sb.append(roman.toString());
            }
        }
        return sb.toString();
    }
}