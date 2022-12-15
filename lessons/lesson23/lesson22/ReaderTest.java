package lessons.lesson23.lesson22;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderTest {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("lines.txt");
                BufferedReader br = new BufferedReader(fr);

        )
        {
            br.lines().forEach(System.out::println);
        }
        catch (Exception e) {
        }

    }
}
