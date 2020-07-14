package amstrongNumbers;

import static java.lang.Math.pow;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        String number = String.valueOf(numberToCheck);
        String[] digitsTable = number.split("");

        double sumOfRootOfNumbers = 0.0;
        double rootOfNumber = 0.0;
        for (int i = 0; i < digitsTable.length; i++) {
            rootOfNumber = pow(Double.parseDouble(digitsTable[i]), digitsTable.length);
            sumOfRootOfNumbers+=rootOfNumber;
        }

        if (numberToCheck==sumOfRootOfNumbers) {
            return true;
        } else {
            return false;
        }
    }
}