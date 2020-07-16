package hamming;

public class Hamming {
    private int hammingDistance = 0;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        IllegalArgumentException e1 = new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        IllegalArgumentException e2 = new IllegalArgumentException("left strand must not be empty.");
        IllegalArgumentException e3 = new IllegalArgumentException("right strand must not be empty.");

        if ((leftStrand.length() != rightStrand.length()) && !leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw e1;
        } else if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw e2;
        } else if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {
            throw e3;
        } else {
            for (int i = 0; i < leftStrand.length(); i++) {
                if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                    hammingDistance++;
                }
            }
        }
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}
