package com.fokinamn.oop.home;

public class Home {
    private final int number;
    private final Floor[] floors;

    public Home(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public int getNumber() {
        return number;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("Home number is " + number + ", number of floors is " + floors.length);
    }
}
