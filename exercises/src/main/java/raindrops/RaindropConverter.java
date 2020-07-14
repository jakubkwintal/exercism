package raindrops;

class RaindropConverter {

    String convert(int number) {
        String raindrop = "";

        if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            if (number % 3 == 0) {raindrop += "Pling";}
            if (number % 5 == 0) {raindrop += "Plang";}
            if (number % 7 == 0) {raindrop += "Plong";}
        } else {raindrop += number;}
        return raindrop;
    }
}