package Homework.hw22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("lines.txt");
                BufferedReader br = new BufferedReader(fr);
                )
        {
            List<String> uniqueWords = new ArrayList<>();
            br.lines().
                    forEach(l -> uniqueWords.addAll(Arrays.asList(l.split(" "))));
            Set<String> uniqueWordsSet = new HashSet<>(uniqueWords);
            System.out.println(uniqueWordsSet);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
