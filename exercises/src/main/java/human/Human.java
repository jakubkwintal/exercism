package human;

public class Human {

    private String name;
    private int age;
    private Hair hair;
    private Eye eye;

    public Human(String name, int age, Hair hair, Eye eye) {
        this.name = name;
        this.age = age;
        this.hair = hair;
        this.eye = eye;
    }

    public static void main(String[] args) {
        Human human = new Human("Maria", 57, Hair.BLOND, Eye.SILVER);
        System.out.println(human.name + " " + human.age + " " + human.hair + " " + human.eye);

    }

}
