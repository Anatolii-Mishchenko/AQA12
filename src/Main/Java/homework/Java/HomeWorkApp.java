package Main.Java.homework.Java;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println("-------------------------------------------");
        System.out.println("Task 1: ");
        printThreeWords();
        System.out.println("Task 2: ");
        checkSumSign();
        System.out.println("Task 3: ");
        printColor();
        System.out.println("Task 4: ");
        compareNumbers();
        System.out.println("-------------------------------------------");
    }




    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void checkSumSign() {
        {
            int a = 5;
            int b = 7;

            if (a + b >= 0) {
                System.out.println("Сумма положительная");
            } else {
                System.out.println("Сумма отрицательная");
            }
        }

    }
    public static void printColor() {

            int value = 69;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value <= 100 || value > 0) {
                System.out.println("Желтый");
            } else if (value > 100) {
                System.out.println("Зеленый");
            }

    }


}







