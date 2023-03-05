package com.fokinamn.oop.collections.hw1;

public class Chat implements Comparable<Chat> {
    private final String name;
    private final int countUsers;

    public Chat(String name, int countUsers) {
        this.name = name;
        this.countUsers = countUsers;
    }

    //сортировка по умолчанию
    @Override
    public int compareTo(Chat o) {
        return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public int getCountUsers() {
        return countUsers;
    }

    @Override
    public String toString() {
        return "Chat name " + name +
                " and countUsers " + countUsers;
    }
}
