package com.fokinamn.cs.lesson18;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * <p>
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class Task2 {
    public static void main(String[] args) {
        double operand1 = 45.6;
        double operand2 = 4987.78;
        char operation = '+';
        double result = getResult(operand1, operand2, operation);
        if (operand2 == 0 && (operation == '/' || operation == '%')) {
            System.out.println("Can't divide by zero");
        } else {
            System.out.println("Result: " + result + " (" + operand1 + operation + operand2 + ")");
        }
    }
    public static double getResult(double operand1, double operand2, char operation) {
        double result = 0;
        if (operation == '+') {
            result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else if (operation == '/') {
            result = operand1 / operand2;
        } else if (operation == '%') {
            result = operand1 % operand2;
        }
        return result;
    }
}
