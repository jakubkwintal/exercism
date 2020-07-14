package reverseString;

class ReverseString {

    String reverse(String inputString) {
        String[] input = inputString.split("");

        String reverseString = "";
        for (int i = input.length - 1; i >= 0; i--) {
            reverseString += input[i];
        }
        return reverseString;
    }
}
