package com.fokinamn.oop.collections.hw2;

import java.util.ArrayList;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<Users> usersList1 = new ArrayList<>(List.of(
                new Users(1,"Masha", 14),
                new Users(2, "Sveta", 24),
                new Users(3, "Ivan", 13),
                new Users(4,"Petr", 28),
                new Users(5, "Igor", 31)
        ));
        List<Users> usersList2 = new ArrayList<>(List.of(
                new Users(6, "Katya", 35),
                new Users(7, "Andrey", 10),
                new Users(8, "Alisa", 15),
                new Users(9, "Dima", 39)
        ));
        List<Users> usersList3 = new ArrayList<>(List.of(
                new Users(10, "Nadya", 27),
                new Users(11, "Sergey", 16),
                new Users(12, "Sasha", 41),
                new Users(13, "Misha", 29)
        ));

        List<Chat> chatList = new ArrayList<>(List.of(
                new Chat("Music",usersList1),
                new Chat("Sport", usersList2),
                new Chat("Cars", usersList3)
        ));

        List<Users> generalChat = GeneralChatUtil.allUsersChat(chatList);
        System.out.println(generalChat);

        System.out.println("Average age of users: " + GeneralChatUtil.averageAge(generalChat));
    }
}
