package com.fokinamn.oop.string;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1 {

    public static void main(String[] args) {
        final String text = "abc Cpddd Dio OsfWw";
        System.out.println(deleteRepeat(text));
    }

    private static String deleteRepeat(String text) {
        String withoutSpace = text.toUpperCase().replace(" ", "");
        char currentCharacter = withoutSpace.charAt(0);
        StringBuilder result = new StringBuilder().append(currentCharacter);
        for (int i = 1; i < withoutSpace.length(); i++) {
            if (currentCharacter != (char) withoutSpace.charAt(i)) {
                currentCharacter = (char) withoutSpace.charAt(i);
                result.append(currentCharacter);
            }
        }
        return String.valueOf(result);
    }
}
