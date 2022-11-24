package Homework.hw24;


// напишите функцию которая выбрасывает все гласные из передаваемой строки "hello" -> "hll"

public class Ex3 {
    public static void main(String[] args) {
        System.out.println(removingVowels("hello"));
    }

    public static String removingVowels(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}
