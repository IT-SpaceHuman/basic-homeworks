package ru.dekhanov.homeworks.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        if (userNumber == 1) {
            greetings();
        } else if (userNumber == 2) {
            checkSign((int)(Math.random()*101),(int)(Math.random()*101),(int)(Math.random()*101));
        } else if (userNumber == 3) {
            selectColor();
        } else if (userNumber == 4) {
            compareNumbers();
        } else if (userNumber == 5) {
            addOrSubtractAndPrint((int)(Math.random()*101),(int)(Math.random()*101), Math.random() > 0.5);
        }
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
        int data = (int)(Math.random()*101);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int)(Math.random()*101);
        int b = (int)(Math.random()*101);
        if (a > b) {
            System.out.println("a" + ">=" + "b");
        } else {
            System.out.println("a" + "<" + "b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}