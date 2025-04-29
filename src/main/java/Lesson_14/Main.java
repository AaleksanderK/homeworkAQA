package Lesson_14;

import static Lesson_14.ArithmeticOperations.*;
import static Lesson_14.FactorialCalculator.calculateFactorial;
import static Lesson_14.NumberComparison.compare;
import static Lesson_14.TriangleArea.calculateArea;

public class Main {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number + "! = " + calculateFactorial(number));

        double base = 6.0;
        double height = 4.0;
        System.out.println("Площадь треугольника: " + calculateArea(base, height));


        int num1 = 10;
        int num2 = 3;

        System.out.println("Сумма: " + add(num1, num2));
        System.out.println("Разность: " + subtract(num1, num2));
        System.out.println("Произведение: " + multiply(num1, num2));
        System.out.println("Частное: " + divide(num1, num2));


        int num3 = 7;
        int num4 = 5;
        System.out.println(compare(num3, num4));
    }
}
