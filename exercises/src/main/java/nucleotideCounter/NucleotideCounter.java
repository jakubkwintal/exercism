package nucleotideCounter;

import java.util.Map;

public class NucleotideCounter {
    private String dna;

    public NucleotideCounter(String dna) {
        this.dna = dna;
        if (!dna.matches("[ACGT]*")) {
            throw new IllegalArgumentException();
        }
    }

    public Map nucleotideCounts() {
        int a = 0;
        int c = 0;
        int g = 0;
        int t = 0;

        for (char nucleoide : dna.toCharArray()) {
            if (nucleoide == 'A') a++;
            if (nucleoide == 'C') c++;
            if (nucleoide == 'G') g++;
            if (nucleoide == 'T') t++;
        }
        return Map.of('A', a, 'C', c, 'G', g, 'T', t);
    }
}
