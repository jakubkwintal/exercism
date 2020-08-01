package luhnValidator;

class LuhnApp {

    public static void main(String[] args) {


        String number = "055 444 285".replaceAll(" ", "");

        String regex = "\\d+\\d";

        if (!number.matches(regex)) {
            System.out.println("Zawiera nie tylko cyfry!");;
        }

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));

            if (number.length() % 2 != 0) {
                if ((i + 1) % 2 == 0 && digit * 2 > 9) {
                    sum += digit * 2 - 9;
                } else if ((i + 1) % 2 == 0) {
                    sum += digit * 2;
                } else {
                    sum += digit;
                }
            } else {
                if ((i + 1) % 2 != 0 && digit * 2 > 9) {
                    sum += digit * 2 - 9;
                } else if ((i + 1) % 2 != 0) {
                    sum += digit * 2;
                } else {
                    sum += digit;
                }
            }
        }

        if (number.matches(regex) && sum % 10 == 0) {
            System.out.println("No i elegancko!");;
        } else
            System.out.println("Sorki, wrong number :P");;

    }
}