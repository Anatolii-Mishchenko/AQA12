package Main.Java.homework.Java;

public abstract class Animals {
    public boolean hunger;
    public String name;
    public int runDistance;
    public int swimDistance;
    public int food;
    public static int count = 0;

    public Animals(boolean hunger, String name, int food, int runDistance, int swimDistance, int count) {
        this.hunger = hunger;
        this.name = name;
        this.food = food;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;

    }

    public Animals(String name) {
    }

    public Animals(int food) {
    }

    public Animals() {

    }

    public static int getCount() {
        return count;
    }

    abstract void run();

    abstract void swim();
}