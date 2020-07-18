package hamming;

public class some {
    private String left;
    private String right;
    private int dist;
    public some(String leftStrand, String rightStrand) {
        int distance = 0;
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.isEmpty() && !leftStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() == rightStrand.length()){
            left = leftStrand;
            right = rightStrand;
        } else {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        for (int i = 0; i < left.length(); i++){
            if (left.charAt(i) != right.charAt(i)){
                distance = distance + 1;
            }
            dist = distance;
        }
    }

    public int getHammingDistance() {
        return dist;
    }


}