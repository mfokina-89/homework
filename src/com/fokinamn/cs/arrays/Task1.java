package com.fokinamn.cs.arrays;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только
 * положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования
 * написанного функционала.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = {8, 9, -16, 0, -9, 2, -56};
        System.out.println(Arrays.toString(deleteNegativeElement(array)));
    }

    private static int[] deleteNegativeElement(int[] array) {
        int[] result = new int[calculateArraySize(array)];
        int indexPositive = 0;
        for (int value : array) {
            if (value >= 0) {
                result[indexPositive] = value * calculateArraySize(array);
                indexPositive++;
            }
        }
        return result;
    }

    private static int calculateArraySize(int[] array) {
        int size = 0;
        for (int value : array) {
            if (value >= 0) {
                size++;
            }
        }
        return size;
    }
}
