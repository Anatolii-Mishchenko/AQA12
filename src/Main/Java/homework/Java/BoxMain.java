package Main.Java.homework.Java;

public class BoxMain {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        Box<Apple> box3 = new Box<>();
        Box<Orange> box2 = new Box<>();
        box1.getFruits(new Apple(1.0F));
        box2.getFruits(new Orange(1.5F));
        box3.getFruits(new Apple(1.0F));
        for (int i = 0; i < 3; i++) {
            box1.addFruit(new Apple());
            box2.addFruit(new Orange());
        }
        for (int i = 0; i < 4; i++) {
            box3.addFruit(new Apple());
        }
        System.out.println("Weight of apple box: " + box1.getWeight());
        System.out.println("Weight of oranges box: " + box2.getWeight());
        System.out.println("Weight of apple box 2: " + box3.getWeight());
        System.out.println("Box with apples is equal to box with oranges: " + box1.compare(box2));
        System.out.println("Apples in box 1: " + box1.getCount());
        System.out.println("Apples in box 2: " + box3.getCount());
        System.out.println("Oranges in box 1: " + box2.getCount());
        box1.moveTo(box3);
        System.out.println("Mix up:");
        System.out.println("Apples in box 1: " + box1.getCount());
        System.out.println("Apples in box 2: " + box3.getCount());
    }
}