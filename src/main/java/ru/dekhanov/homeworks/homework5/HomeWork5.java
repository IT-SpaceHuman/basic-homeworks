package ru.dekhanov.homeworks.homework5;

public class HomeWork5 {
    public static void main(String[] args) {
        int[][] array = new int[][]{{78, 56, 4}, {45, 60}};
        int[][] array2 = new int[10][10];

        System.out.println(sumOfPositiveElements(array));
        System.out.println("_____________________");
        squareofInt(10);
        System.out.println("_____________________");
        randomArray(array2);
        zeroDiagonal(array2);
        print(array2);
        System.out.println("_____________________");
        System.out.println(findMax(array));
        System.out.println("_____________________");
        System.out.println(sumofLine(array));

    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static void squareofInt(int size) {
        for (int i = 0; i <= size + 1; i++) {
            for (int j = 0; j <= size + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static int[][] randomArray(int[][] array3) {
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[i][j] = (int) (Math.random() * 10);
            }
        }
        return array3;
    }

    public static void zeroDiagonal(int[][] array3) {
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (i == j) {
                    array3[i][j] = 0;
                }
            }
        }
    }

    public static void print(int[][] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumofLine(int[][] array) {
        int sum = 0;
        if (array.length <= 1) {
            sum = -1;
        } else {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
        }
        return sum;
    }
}