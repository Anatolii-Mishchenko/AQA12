package Main.Java.homework.Java;

import java.net.SocketOption;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Random;

public class HomeWork7 {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        System.out.println(compareNumbers());
        System.out.println("Task 2: ");
        positiveOrNegative();
        System.out.println("Task 3: ");
        System.out.println(positiveOrNegative2());
        System.out.println("Task 4: ");
        printWord();
        System.out.println("Task 4 addition:");
        System.out.println(checkYear(2020));
        System.out.println(checkYear(2021));
        System.out.println(checkYear(2100));
        System.out.println(checkYear(2400));
        System.out.println("Task 5: ");
        invertNumbers();
        System.out.println(" ");
        System.out.println("Task 6: ");
        oneHundredNumbers();
        System.out.println(" ");
        System.out.println("Task 7: ");
        numberMultiply();
        System.out.println(" ");
        System.out.println("Task 8: ");
        squaredArray();
        System.out.println(" ");
        System.out.println("Task 9: ");
        twoArguments(6, 9);


    }


    public static boolean compareNumbers() {

        int a = 6;
        int b = 9;
        {
            int sum = a + b;
            return sum >= 10 && sum <= 20;
        }
    }

    public static void positiveOrNegative() {
        int a = 1;
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static boolean positiveOrNegative2() {
        int a = 3;
        if (a >= 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void printWord() {
        for (int i = 1; i < 11; i++) {
            System.out.println("finger=" + i);

        }
        System.out.println("no more fingers");
    }

    public static boolean checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }


    public static void invertNumbers() {
        int[] numbersToInvert = {1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < numbersToInvert.length; i++) {
            if (numbersToInvert[i] == 1) {
                numbersToInvert[i] = 0;
            } else if (numbersToInvert[i] == 0) {
                numbersToInvert[i] = 1;
            }
            System.out.print(numbersToInvert[i] + " ");

        }
    }

    public static void oneHundredNumbers() {
        int[] hundredNumbers = new int[100];
        for (int i = 0; i < hundredNumbers.length; i++) {
            hundredNumbers[i] = i + 1;
            System.out.print(hundredNumbers[i] + " ");
        }

    }

    public static void numberMultiply() {
        int[] numbersToMultiply = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbersToMultiply.length; i++) {
            if (numbersToMultiply[i] < 6) {
                numbersToMultiply[i] = numbersToMultiply[i] * 2;
            } else if (numbersToMultiply[i] >= 6) {
                numbersToMultiply[i] = numbersToMultiply[i];
            }
            System.out.print(numbersToMultiply[i] + " ");
        }


    }
    public static void squaredArray () {
        int table = 1;
        int[][] square = new int [5][5];

        for (int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(square[i][j]+" ");
                table ++;

            }
            System.out.println();
        }



    }

    public static void twoArguments (int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("("+ i + ")" + " " + arr[i] + " ");
        }



    }





}





































