package dnDCharacter;

import java.util.Arrays;
import java.util.Random;

class DnDCharacter {
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    public DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int ability() {
        Random random = new Random();
        int[] randomTable = new int[4];

        for(int i=0; i<randomTable.length; i++) {
            randomTable[i] = random.nextInt(6) + 1; // wzór na zakres losowania między x i y: (y - x + 1) + x;
        }

        int sum = Arrays.stream(randomTable).sum();
        int lowest = Arrays.stream(randomTable).min().getAsInt();
        return sum - lowest;
    }

    public int modifier(int input) {
        return (int) Math.floor(((double) (input - 10) / 2));
    }

    public int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return this.modifier(this.getConstitution()) + 10;
    }
}
