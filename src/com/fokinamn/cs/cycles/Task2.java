package com.fokinamn.cs.cycles;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class Task2 {
    public static void main(String[] args) {
        int number = 8735962;
        System.out.println(number + " -> " + reversalNumber(number));
    }

    private static int reversalNumber(int number) {
        int reversalNumber = 0;
        for (; number > 0; number /= 10) {
            reversalNumber = reversalNumber * 10 + number % 10;
        }
        return reversalNumber;
    }
}
