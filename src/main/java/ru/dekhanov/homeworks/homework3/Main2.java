package ru.dekhanov.homeworks.homework3;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
//        printSomeTimes(10, "Peace");
//        arraySum(new int[]{1, 2, 4, 0, 7, 8});
//        fillArray(89, new int[] {5, 4, 3});
//        increasedByInt(3, new int[]{1, 3, 5});
        halvsCompare(new int[] {8, 6, 3, 7});
    }
    public static void printSomeTimes(int times, String word) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 5) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int a, int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = a;
        }
        System.out.println(Arrays.toString(b));
    }

    public static void increasedByInt(int a, int[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i] = c[i] * a;
        }
        System.out.println(Arrays.toString(c));
    }

    public static void halvsCompare(int[] d) {
        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < d.length; i++) {
            if (i < d.length / 2) {
                sumOne = sumOne + d[i];
            } else {
                sumTwo = sumTwo + d[i];
            }
        }

        if (sumOne > sumTwo) {
            System.out.println("Сумма первой половины больше");
        } else if (sumOne < sumTwo) {
            System.out.println("Cумма второй половины больше");
        } else {
            System.out.println("Они равны");
        }
    }
}

