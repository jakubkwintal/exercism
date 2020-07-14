package dnDCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DnDApp {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> ability = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ability.add(random.nextInt(6) + 1); // wzór na zakres losowania między x i y: (y - x + 1) + x;
            System.out.println(ability.get(i));
        }
        int minimum = 6;
        for (int i = 0; i < ability.size(); i++) {
            if (minimum > ability.get(i)) {
                minimum = ability.get(i);
            }
        }
        System.out.println("MINIMUM: " + minimum);
        ability.remove(minimum);

        System.out.println("SIZE: " + ability.size());

        int abilitySum = 0;
        for (int i = 0; i < ability.size(); i++) {
            System.out.println(ability.get(i));
            abilitySum += ability.get(i);
        }

        System.out.println("SUM: " + abilitySum);
    }
}