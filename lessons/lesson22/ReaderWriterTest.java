package lessons.lesson22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderWriterTest {
    public static void main(String[] args) {
        String line = "";
        List<String> lines = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter lines until stop");
        do  {
            line = keyboard.nextLine();
            lines.add(line);
        } while (!line.equals("stop"));

        try (
                FileWriter fw = new FileWriter("lines.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(fw);
                )
        {
            for (int i = 0; i < lines.size(); i++) {
//                bw.write(lines.get(i));
//                bw.newLine();
                pw.println(lines.get(i));
            }
        }
        catch (Exception e) {

        }
    }
}
