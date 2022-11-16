package Homework.hw22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {

        try (
                FileReader fr = new FileReader("lines.txt");
                BufferedReader br = new BufferedReader(fr);
        )

        {
            List<String> word = new ArrayList<>();
            br.lines()
                    .forEach(l -> word.addAll(Arrays.asList(l.split(" "))));

            word.stream()
                    .max(Comparator.comparing(String::length))
                    .ifPresent(System.out::println);

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
