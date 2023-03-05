package com.fokinamn.oop.collections.hw1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUtil {
    private ChatUtil() {
    }

    public static void deleteChat(List<Chat> chats) {
        Iterator<Chat> iterator = chats.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCountUsers() < 1000) {
                iterator.remove();
            }
        }
    }
}
