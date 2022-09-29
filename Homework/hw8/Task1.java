/* Напишите функцию которая принимает строку и возвращает коллекцию из всех уникальных букв этой строки.
 Пример: "Hello, world!" -> [H, e, l, o, ...] - o и l должны быть представлены только 1 раз
 */

package Homework.hw8;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String phrase = "Hello, world!";
        System.out.println(character(phrase));
    }

    public static HashSet<String> character(String line) {
        HashSet<String> setOfCharacter = new HashSet<>();
        List<String> letters = Arrays.asList(line.split(""));
        setOfCharacter.addAll(letters);
        return setOfCharacter;
    }
}
