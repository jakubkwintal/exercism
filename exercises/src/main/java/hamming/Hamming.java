package hamming;

public class Hamming {
    private int hammingDistance = 0;

    public Hamming(String leftStrand, String rightStrand) {

        if ((leftStrand.length() != rightStrand.length()) && !leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        } else if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
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
