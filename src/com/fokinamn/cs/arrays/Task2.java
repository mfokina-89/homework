package com.fokinamn.cs.arrays;

import java.util.Arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы,
 * которые больше этого среднего арифметического.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] result = arrayChar(array);
        System.out.println(Arrays.toString(result));
        printBiggerThanAverage(result);
    }

    private static int[] arrayChar(char[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int symbol = array[i];
            result[i] = symbol;
        }
        return result;
    }

    private static double average(int[] result) {
        double sum = 0;
        for (int i : result) {
            sum += i;
        }
        return sum / result.length;
    }

    private static void printBiggerThanAverage(int[] result) {
        double average = average(result);
        for (int value : result) {
            if (value > average) {
                System.out.print(value + " ");
            }
        }
    }
}
