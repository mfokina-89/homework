package com.fokinamn.oop.collections.hw1;

import com.fokinamn.oop.collections.hw1.comparator.ChatNameComparator;
import com.fokinamn.oop.collections.hw1.comparator.CountUsersComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */
public class ChatDemo {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>();
        chats.add(new Chat("Movies", 567));
        chats.add(new Chat("Music", 1098));
        chats.add(new Chat("Cars", 1987));
        chats.add(new Chat("Sport", 1157));
        chats.add(new Chat("Books", 592));
        chats.add(new Chat("Beauty", 1157));

        ChatUtil.deleteChat(chats);
        for (Chat chat : chats) {
            System.out.println(chat.toString());
        }

        chats.sort(new CountUsersComparator().reversed().thenComparing(new ChatNameComparator()));
        System.out.println(chats);
    }
}
