package lessons.lesson23;

import Homework.hw19.Emp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ClassTokenizer {
    public static void main(String[] args) {
//        Emp maxKotkov = new Emp("Max Kotkov", 21, "programmer");
//        serialize(maxKotkov, "max-kotkov.txt");
        Emp emp = deserialize("max-kotkov.txt");
        System.out.println(emp);
    }

    public static void serialize(Emp e, String filename) {
        try (
                FileWriter fileWriter = new FileWriter(filename);
                PrintWriter printWriter = new PrintWriter(fileWriter);
        ) {
            printWriter.print(e.getName());
            printWriter.print("|");
            printWriter.print(e.getAge());
            printWriter.print("|");
            printWriter.print(e.getPosition());

        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public static Emp deserialize(String filename) {
        try (
                FileReader fileReader = new FileReader(filename);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String line = bufferedReader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line, "|");

            String name = tokenizer.nextToken();
            int age = Integer.parseInt(tokenizer.nextToken());
            String profession = tokenizer.nextToken();

            return new Emp(name, age, profession);
        } catch (Exception ex) {
            System.err.println(ex);
        }
        return null;
    }
}
