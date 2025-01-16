package Main.Java.homework.Java;

public class Plate extends Cat {

    public Plate(boolean hunger, String name, int food, int runDistance, int swimDistance, int count) {
        super(hunger, name, food, runDistance, swimDistance, count);
    }

    public Plate(int food) {
        super(food);
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
        System.out.println("Food has been added: " + amount);
        System.out.println(" Now there is " + food + " of food.");
    }

    public int getFood() {
        return food;
    }
}