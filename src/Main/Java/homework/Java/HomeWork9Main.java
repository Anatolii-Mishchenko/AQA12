package Main.Java.homework.Java;

public class HomeWork9Main {


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run();
        cat.swim();

        Dog dog = new Dog();
        dog.run();
        dog.swim();

        System.out.println("All animals: " + (Dog.getDogCount() + Cat.getCount()));
        System.out.println("Dogs: " + Dog.getDogCount());
        System.out.println("Cats: " + Cat.getCatCount());
        Plate plate = new Plate(30);
        Cat[] cats = {new Cat("Luna"), new Cat("Maya"), new Cat("Angela")};

        for (Cat c : cats) {
            c.eat(plate);
        }

        for (Cat c : cats) {
            System.out.println(c.name + " fed: " + c.isHunger());
        }

        plate.addFood(20);
    }
}
