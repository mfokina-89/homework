package com.fokinamn.oop.atm;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm = new Atm(67, 87, 35);

        atm.addBanknote10(20);
        atm.addBanknote20(15);
        atm.addBanknote50(89);

        atm.printBalance();

        atm.getCash(-679);
        atm.getCash(450);
        atm.getCash(9870);

        atm.printBalance();
    }
}
