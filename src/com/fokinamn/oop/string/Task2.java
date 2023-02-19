package com.fokinamn.oop.string;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println("Sum of elements is " + calculateSum(numberArray(text)) + " " + Arrays.toString(numberArray(text)));
    }

    private static int[] numberArray(String value) {
        value = value.replace(" ", "");
        String numbers = "0123456789";
        StringBuilder numberStr = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            if (numbers.contains(value.substring(i, i + 1))) {
                numberStr.append(value.charAt(i));
            }
        }
        int[] result = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(numberStr.charAt(i)));
        }
        return result;
    }

    private static int calculateSum(int[] numberArray) {
        int sum = 0;
        for (int i : numberArray) {
            sum += i;
        }
        return sum;
    }
}
