package com.fokinamn.oop.home;

public class Apartment {
    private final int number;
    private final Room[] rooms;

    public Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Apartment number is " + number + ", number of rooms is " + rooms.length);
    }
}
