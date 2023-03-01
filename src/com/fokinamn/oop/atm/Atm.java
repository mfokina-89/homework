package com.fokinamn.oop.atm;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег,
 * а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20,
 * и только затем 10 (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).
 */
public class Atm {
    private int banknote10;
    private int banknote20;
    private int banknote50;
    private final int TEN = 10;
    private final int TWENTY = 20;
    private final int FIFTY = 50;

    public Atm(int banknote10, int banknote20, int banknote50) {
        this.banknote10 = banknote10;
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
    }

    public void addBanknote10(int banknote10) {
        this.banknote10 += banknote10;
    }

    public void addBanknote20(int banknote20) {
        this.banknote20 += banknote20;
    }

    public void addBanknote50(int banknote50) {
        this.banknote50 += banknote50;
    }

    public boolean getCash(int amount) {
        if (amount <= 0) {
            System.out.println("Amount entered incorrectly");
            return false;
        }

        if (!isNotEmptyAtm(amount)) {
            System.out.println("There is not enough money in the ATM");
            return false;
        }

        int fifties = Math.min(banknote50, Math.max(amount / FIFTY, 0));
        int twenties = Math.min(banknote10, Math.max((amount - (fifties * FIFTY)) / TWENTY, 0));
        int tens = Math.min(banknote10, (amount - (fifties * FIFTY) - (twenties * TWENTY)) / TEN);

        if (amount - (fifties * FIFTY) - (twenties * TWENTY) - (tens * TEN) > 0) {
            return false;
        }

        banknote50 -= fifties;
        banknote20 -= twenties;
        banknote10 -= tens;
        System.out.println("Money transfer was successful: ");
        printDetails(fifties, twenties, tens);
        return true;
    }

    public void printBalance() {
        System.out.println("Balance of ATM: ");
        printDetails(banknote50, banknote20, banknote10);
    }

    private void printDetails(int fifties, int twenties, int tens) {
        if (fifties > 0) {
            System.out.println(fifties + " " + (fifties > 1 ? "banknote" : "banknotes") + " denomination " + FIFTY);
        }
        if (twenties > 0) {
            System.out.println(twenties + " " + (twenties > 1 ? "banknote" : "banknotes") + " denomination " + TWENTY);
        }
        if (tens > 0) {
            System.out.println(tens + " " + (tens > 1 ? "banknote" : "banknotes") + " denomination " + TEN);
        }
    }

    private boolean isNotEmptyAtm(int amount) {
        return ((banknote50 * FIFTY) + (banknote20 * TWENTY) + (banknote10 * TEN)) > amount;
    }
}
