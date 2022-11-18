package Homework.hw23;

import java.io.BufferedReader;
import java.io.FileReader;

public class Tasks {
    public static void main(String[] args) {
        long noLines = numberOfLines("lines.txt");
        System.out.println(noLines);

        long noLinesSubstring = numberLinesSubstring("lines.txt" , "ll");
        System.out.println(noLinesSubstring);
    }

    //Напишите функцию, которая принимает название текстового файла возвращает количество строк в нем
    public static long numberOfLines(String filename) {
        try (
                FileReader fileReader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            return bufferedReader.lines().count();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return Long.parseLong(null);
    }

    public static long numberLinesSubstring(String filename, String substring) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename)))
        {
            return bufferedReader.lines().filter(l -> l.contains(substring)).count();
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return Long.parseLong(null);
    }

}
