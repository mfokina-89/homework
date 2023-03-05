package com.fokinamn.oop.collections.hw2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GeneralChatUtil {
    private static final int ESTIMATED_AGE = 18;

    private GeneralChatUtil() {
    }

    public static List<Users> allUsersChat(List<Chat> chatList) {
        Map<Integer, Users> allUserChat = new HashMap<>();
        for (Chat chat : chatList) {
            for (Users user : chat.getUsers()) {
                if (user.getYearsOld() > ESTIMATED_AGE) {
                    allUserChat.put(user.getId(), user);
                }
            }
        }
        return new ArrayList<>(allUserChat.values());
    }

    public static double averageAge(List<Users> usersList) {
        double sum = 0.0;
        Iterator<Users> iterator = usersList.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next().getYearsOld();
        }
        return sum / usersList.size();
    }
}
