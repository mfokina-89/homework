package com.fokinamn.oop.collections.hw2;

import java.util.List;

public class Chat {
    private final String chatName;
    private final List<Users> users;

    public Chat(String chatName, List<Users> users) {
        this.chatName = chatName;
        this.users = users;
    }

    public String getChatName() {
        return chatName;
    }

    public List<Users> getUsers() {
        return users;
    }
}
