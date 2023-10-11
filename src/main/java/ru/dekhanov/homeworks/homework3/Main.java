package ru.dekhanov.homeworks.homework3;
public class Main {
    public static void main(String[] args) {
        greetings();
        checkSign(-3, 0, 4);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(89, 68, true);
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Cумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = 4;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 4;
        int b = 6;
        if (a > b) {
            System.out.println("a" + ">=" + "b");
        } else {
            System.out.println("a" + "<" + "b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
