package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        System.out.println(checkSum(9, 1));
        checkNum(-2);
        System.out.println(checkBoolNum(-1));
        printStr("asd", 2);
        System.out.println(yearChecker(2025));
        rerollNumArr();
        fillArrNum();
        multiplyNumArr();
        squareArray();
        twoArgumentsArr(2, 2);
    }

    static void printThreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    static void checkSumSing() {
        int a = 1;
        int b = 21;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");

    }

    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else System.out.println("Зеленый");
    }

    static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else System.out.println("a < b");

    }

    static boolean checkSum(int a, int b) {
        return ((a + b) <= 20) && ((a + b) >= 10);
    }

    static void checkNum(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    static boolean checkBoolNum(int a) {
        return a < 0;
    }

    static void printStr(String str, int i) {
        String result = "";
        for (int u = 0; u < i; u++) {
            result = result + str + "\n";
        }
        System.out.println(result);
    }

    static boolean yearChecker(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    static void rerollNumArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] = 0;
            } else if (arr[i] % 2 == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void fillArrNum() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void multiplyNumArr() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void squareArray() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void twoArgumentsArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("[" + i + "]" + arr[i] + " ");
        }
    }
}