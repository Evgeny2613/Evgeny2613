/*  Напишите функцию которая принимает строку и возвращает коллекцию из всех уникальных букв этой строки,
отсортированных по возрастанию.
 Коллекциями являются List, Set и т.п.
 */

package Homework.hw8;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the phrase: ");
        System.out.println(sortedUniqueCharacter(input.nextLine()));

    }

    public static TreeSet<String> sortedUniqueCharacter(String phrase) {
        TreeSet<String> sortedUniqueLetters = new TreeSet<>();

        List<String> letters = Arrays.asList(phrase.split(""));
        sortedUniqueLetters.addAll(letters);
        return sortedUniqueLetters;
    }
}
