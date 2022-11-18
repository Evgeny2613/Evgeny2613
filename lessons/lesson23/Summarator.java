package lessons.lesson23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Summarator {
    public Summarator() {
    }

    public static void main(String[] args) throws FileNotFoundException {
//       try (
//               FileReader fileReader = new FileReader("digits.txt");
//               BufferedReader bufferedReader = new BufferedReader(fileReader);
//               )
//       {
//           bufferedReader.lines()
//                   .map(Integer::parseInt)
//                   .reduce(Integer::sum)
//                   .ifPresent(System.out::println);
//       }
//       catch (Exception e) {
//           System.err.println(e);
//       }
        int sum = 0;
        Scanner scanner = new Scanner(new FileInputStream("digits.txt"));
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            sum += i;
        }
        System.out.println(sum);
    }
}
