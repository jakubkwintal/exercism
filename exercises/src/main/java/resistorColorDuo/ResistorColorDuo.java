package resistorColorDuo;

class ResistorColorDuo {
    int value(String[] colors) {

        String twoColors = "";
        String[] allColors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        for (int i = 0; i < 2; i++) {
            for (int n = 0; n < allColors.length; n++) {
                if (allColors[n].equals(colors[i])) {
                    String num = Integer.toString(n);
                    twoColors += num;
                }
            }
        }
        int result = Integer.parseInt(twoColors);
        return result;
    }
}