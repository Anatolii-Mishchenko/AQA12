package Main.Java.homework.Java;

public class Cat extends Animals {

    public Cat(boolean hunger, String name, int food, int runDistance, int swimDistance, int count) {
        super(hunger, name, food, runDistance, swimDistance, count);
    }

    private static int catCount = 0;
    public boolean hunger;

    public Cat() {
        super();
        this.name = "Luna";
        this.runDistance = 150;
        this.hunger = false;
        catCount++;
    }

    public Cat(int food) {
        super(food);
    }

    public Cat(String name) {
    }


    @Override
    void run() {
        if (runDistance < 200) {
            System.out.println(name + " ran " + runDistance + "m");
        } else if (runDistance > 200) {
            System.out.println(name + " reached her maximum distance");
        }

    }

    @Override
    void swim() {
        System.out.println(name + " can't swim");
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(10)) {
            hunger = true;
            System.out.println(name + " ate and now if fed.");
        } else {
            System.out.println(name + " couldn't eat, not enough food.");
        }
    }
}