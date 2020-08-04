package series;

import java.util.Arrays;
import java.util.List;

public class Series {
    private String number;

    public Series(String number) {
        this.number = number;
    }

    public List<String> slices(int i) {
        if(i<1) {
            throw new IllegalArgumentException("Slice size is too small.");
        }
        if(i>number.length()) {
            throw new IllegalArgumentException("Slice size is too big.");
        }

        String[] series = new String[number.length()-i+1];
        for (int n = 0; n < number.length() - i + 1; n++) {
            StringBuilder sb = new StringBuilder("");
            for (int m = 0; m < i; m++) {
                sb.append(number.charAt(m+n));
            }
            series[n] = sb.toString();
        }
        return Arrays.asList(series);
    }
}
