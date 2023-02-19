package com.fokinamn.oop.home;

public class Room {
    private final boolean passageRoom;

    public Room(boolean passageRoom) {
        this.passageRoom = passageRoom;
    }

    public boolean isPassageRoom() {
        return passageRoom;
    }

    public void print() {
        if (isPassageRoom()) {
            System.out.println("This room is passage room");
        } else {
            System.out.println("This roon is not passage room");
        }
    }
}

