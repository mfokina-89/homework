package com.fokinamn.cs.cycles;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * <p>
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input value: ");
        int value = console.nextInt();
        int even = evenNumber(value);
        int uneven = unevenNumber(value);
        System.out.println("Value " + value + " have " + even + " even number and " + uneven + " uneven");
    }

    private static int evenNumber(int value) {
        int result = 0;
        for (int currentValue = value; currentValue > 0; currentValue /= 10) {
            int number = currentValue % 10;
            if (number % 2 == 0) {
                result++;
                System.out.print(number + " ");
            }
        }
        System.out.println("Amount even number " + result);
        return result;
    }

    private static int unevenNumber(int value) {
        int result = 0;
        for (int currentValue = value; currentValue > 0; currentValue /= 10) {
            int number = currentValue % 10;
            if (number % 2 != 0) {
                result++;
                System.out.print(number + " ");
            }
        }
        System.out.println("Amount uneven number " + result);
        return result;
    }
}
