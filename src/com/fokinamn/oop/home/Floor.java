package com.fokinamn.oop.home;

public class Floor {
    private final int number;
    private final Apartment[] apartments;

    public Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public int getNumber() {
        return number;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void print() {
        System.out.println("Floor number is " + number + ", number of apartments is " + apartments.length);
    }
}
