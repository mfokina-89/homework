package com.fokinamn.cs.arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами,
 * только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = { 0, 1, 9, 0, 3};
        int[][] result = resultArray(array);
        for (int[] i : result) {
            System.out.print("[");
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    private static int[] negativeArray(int[] array) {
        int negativeSize = 0;
        for (int value : array) {
            if (value < 0) {
                negativeSize ++;
            }
        }
        if (negativeSize == 0) {
            return new int[]{};
        } else {
            int[] negativeArray = new int[negativeSize];
            int index = 0;
            for (int value : array) {
                if (value < 0) {
                    negativeArray[index] = value;
                    index ++;
                }
            }
            return negativeArray;
        }
    }

    private static int[] zeroArray(int[] array) {
        int zeroSize = 0;
        for (int value : array) {
            if (value == 0) {
                zeroSize ++;
            }
        }
        if (zeroSize == 0) {
            return new int[]{};
        } else {
            int[] zeroArray = new int[zeroSize];
            int index = 0;
            for (int value : array) {
                if (value == 0) {
                    zeroArray[index] = value;
                    index++;
                }
            }
            return zeroArray;
        }
    }

    private static int[] positiveArray(int[] array) {
        int positiveSize = 0;
        for (int value : array) {
            if (value > 0) {
                positiveSize ++;
            }
        }
        if (positiveSize == 0) {
            return new int[]{};
        } else {
            int[] positiveArray = new int[positiveSize];
            int index = 0;
            for (int value : array) {
                if (value > 0) {
                    positiveArray[index] = value;
                    index ++;
                }
            }
            return positiveArray;
        }
    }

    private static int[][] resultArray(int[] array) {
        int[][] resultArray = new int[3][];
        resultArray[0] = negativeArray(array);
        resultArray[1] = zeroArray(array);
        resultArray[2] = positiveArray(array);
        return resultArray;
    }
}
