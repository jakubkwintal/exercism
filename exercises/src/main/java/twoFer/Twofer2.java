package twoFer;

class Twofer2 {
    public String twofer(String name) {

        if (name == null || name == " ") {
            name = "you";
        }

        return "One for " + name + ", one for me.";
    }
}