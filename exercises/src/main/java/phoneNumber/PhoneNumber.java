package phoneNumber;

public class PhoneNumber {
    private String number;
    private StringBuilder sb;

    public PhoneNumber(String number) {

        this.number = number.replaceAll("[ |\\(|\\)|\\-\\.\\+]", "");
        this.sb = new StringBuilder(this.number);

        if (this.number.matches(".*([a-z]|[A-Z])+.*")) {
            throw new IllegalArgumentException("letters not permitted");
        }
        if (this.number.matches(".*\\W+.*")) {
            throw new IllegalArgumentException("punctuations not permitted");
        }
        if (sb.length() < 10) {
            throw new IllegalArgumentException("incorrect number of digits");
        }
        if (sb.length() > 11) {
            throw new IllegalArgumentException("more than 11 digits");
        }
        if (sb.length() == 11 && sb.charAt(0) != '1') {
            throw new IllegalArgumentException("11 digits must start with 1");
        }
        if ((sb.length() == 10 && sb.charAt(0) == '0') || (sb.length() == 11 && sb.charAt(1) == '0')) {
            throw new IllegalArgumentException("area code cannot start with zero");
        }
        if ((sb.length() == 10 && sb.charAt(0) == '1') || (sb.length() == 11 && sb.charAt(1) == '1')) {
            throw new IllegalArgumentException("area code cannot start with one");
        }
        if ((sb.length() == 10 && sb.charAt(3) == '0') || (sb.length() == 11 && sb.charAt(4) == '0')) {
            throw new IllegalArgumentException("exchange code cannot start with zero");
        }
        if ((sb.length() == 10 && sb.charAt(3) == '1') || (sb.length() == 11 && sb.charAt(4) == '1')) {
            throw new IllegalArgumentException("exchange code cannot start with one");
        }
    }

    public String getNumber() {

        if (sb.length() == 11) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
