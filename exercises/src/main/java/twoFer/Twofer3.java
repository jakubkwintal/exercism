package twoFer;

class Twofer3 {
    public String twofer(String name) {

       return name == null || name == " " ? "One for you, one for me." : "One for " + name + ", one for me.";
    }
}