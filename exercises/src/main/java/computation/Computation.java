package computation;

public enum Computation {

    MULTIPLY {
        public double perform(double x, double y) {
            return x * y;
        }
    },

    DIVIDE {
        public double perform(double x, double y) {
            return x / y;
        }
    },

    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },

    SUBSTRACT {
        public double perform(double x, double y) {
            return x - y;
        }
    };

    public abstract double perform(double x, double y);

    // Metody można wywołać również bezpośrednio w tej klasie:
//    public static void main(String[] args) {
//        System.out.println(Computation.ADD.perform(3, 4));
//        System.out.println(Computation.SUBSTRACT.perform(3, 4));
//        System.out.println(Computation.MULTIPLY.perform(3, 4));
//        System.out.println(Computation.DIVIDE.perform(3, 4));
//    }
}