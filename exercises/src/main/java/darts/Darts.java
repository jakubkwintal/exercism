package darts;

class Darts {
    private double distance;

    Darts(double x, double y) {
        distance = Math.sqrt(x * x + y * y); // Pythagorean theorem
    }

    int score() {
        if (distance <= 1) {
            return 10;
        } else if (distance <= 5) {
            return 5;
        } else if (distance <= 10) {
            return 1;
        } else return 0;
    }
}