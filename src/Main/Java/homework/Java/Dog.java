package Main.Java.homework.Java;

public class Dog extends Animals {

    public Dog(boolean hunger, String name, int food, int runDistance, int swimDistance, int count) {
        super(hunger, name, food, runDistance, swimDistance, count);
    }

    private static int dogCount = 0;

    public Dog() {
        super();
        this.name = "Hachiko";
        this.runDistance = 350;
        this.swimDistance = 5;
        dogCount++;
    }


    @Override
    void run() {
        if (runDistance < 500) {
            System.out.println(name + " ran " + runDistance + "m");
        } else if (runDistance > 500) {
            System.out.println(name + " reached his maximum distance");
        }
    }

    @Override
    void swim() {
        if (swimDistance < 10) {
            System.out.println(name + " swam " + swimDistance + "m");
        } else if (swimDistance > 10) {
            System.out.println(name + " reached his maximum distance");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}