package bob;

public class BobNotMine {


    private final static String DEFAULT_RESPONSE = "Whatever.";
    private final static String SURE_RESPONSE = "Sure.";
    private final static String FINE_RESPONSE = "Fine. Be that way!";
    private final static String WHOA_RESPONSE = "Whoa, chill out!";
    private final static String CALM_RESPOSE = "Calm down, I know what I'm doing!";

    public String hey(String string) {

        string = string.trim();
        boolean shout = string.matches("[A-Z?].*") && string.equals(string.toUpperCase());

        if (string.length() == 0) return FINE_RESPONSE;
        else if (string.endsWith("?") && shout) return CALM_RESPOSE;
        else if (string.endsWith("?") && !(shout)) return SURE_RESPONSE;
        else if (!string.equals(string.toLowerCase()) && string.equals(string.toUpperCase())) return WHOA_RESPONSE;

        return DEFAULT_RESPONSE;
    }

}