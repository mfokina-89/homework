package com.fokinamn.oop.collections.hw1.comparator;

import com.fokinamn.oop.collections.hw1.Chat;

import java.util.Comparator;

public class CountUsersComparator implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o1.getCountUsers(), o2.getCountUsers());
    }
}
