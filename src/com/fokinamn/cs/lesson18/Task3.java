package com.fokinamn.cs.lesson18;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 17;

        int a2 = 3;
        int b2 = 9;
        double s = getSquare(a, b);
        double s2 = getSquare(a2, b2);
        compareSquare(s, s2);
    }

    public static double getSquare(int a, int b) {
        return (a * b) * 1.0 / 2;
    }

    public static void compareSquare(double square1, double square2) {
        if (square1 > square2) {
            System.out.println("Square1: " + square1 + " > Square2: " + square2);
        } else if (square2 > square1) {
            System.out.println("Square2: " + square2 + " > Square1: " + square1);
        } else {
            System.out.println("Square1: " + square1 + " = Square2: " + square2);
        }
    }
}
