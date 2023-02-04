package com.fokinamn.cs.lesson18;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */
public class Task1 {
    public static void main(String[] args) {
        int minutes = 25;
        getQuarterHour(minutes);
    }
    public static void getQuarterHour(int minutes) {
        if (minutes < 0 || minutes > 59) {
            System.out.println("Minutes is invalid: " + minutes);
        } else if (0 <= minutes && minutes <= 14) {
            System.out.println(minutes + " is 1 quarter of an hour");
        } else if (15 <= minutes && minutes <= 29) {
            System.out.println(minutes + " is 2 quarter of an hour");
        } else if (30 <= minutes && minutes <= 44) {
            System.out.println(minutes + " is 3 quarter of an hour");
        } else {
            System.out.println(minutes + " is 4 quarter of an hour");
        }
    }
}
