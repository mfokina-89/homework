package com.fokinamn.cs.cycles;

/**
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 */
public class Task3 {
    public static void main(String[] args) {
        int salary = 600;
        calculate(salary);
    }

    private static void calculate(int money) {
        int expenses = 300;
        double partForInvest = 0.1;
        int periodInMonth = 38;
        double bankAccount = 0;
        double brokerAccount = 0;

        for (int i = 1; i <= periodInMonth; i++) {
            if (i % 6 == 0) {
                money += 400;
            }
            bankAccount += (money - expenses) - money * partForInvest;
            brokerAccount += (brokerAccount * 0.02) + money * partForInvest;
        }
        System.out.println("Ivan's bank account: " + bankAccount + ", broker account: " + brokerAccount);
    }
}

