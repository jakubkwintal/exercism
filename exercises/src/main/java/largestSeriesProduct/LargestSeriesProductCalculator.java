package largestSeriesProduct;

class LargestSeriesProductCalculator {
    private String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        this.inputNumber = inputNumber;
        if (inputNumber.length() > 0 && !inputNumber.matches("\\d+")) {
            throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        if (inputNumber.length() < numberOfDigits) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
        if (numberOfDigits < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }

        long max = 0;
        for (int i = 0; i < inputNumber.length() - numberOfDigits + 1; i++) {
            long product = 1;
            for (int n = 0; n < numberOfDigits; n++) {
                product *= Long.parseLong(String.valueOf(inputNumber.charAt(i + n)));
            }
            if (product > max) {
                max = product;
            }
        }
        return max;
    }
}
