package computation;

public class ComputationApp {

    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(24, 4));
        System.out.println(Computation.SUBSTRACT.perform(3, 56));
        System.out.println(Computation.MULTIPLY.perform(24, 25));
        System.out.println(Computation.DIVIDE.perform(4, 7));
        System.out.println("================================");

        // Wyświetlenie funkcji kalkulatora
        Computation[] computations = Computation.values();
        for (Computation computation: computations) {
            System.out.println(computation);
        }
    }
}
