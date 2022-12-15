package lessons.lesson23.lesson22;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputTest {
    public static void main(String[] args) throws IOException {
         byte[] data = new byte[10];
        System.out.println("Please, enter some characters: ");
        int numberOfCharacters = System.in.read(data);
        System.out.println("You entered " + numberOfCharacters + " chars");
        for (int i = 0; i < numberOfCharacters; i++) {
            System.out.print((char) data[i]);
            try (
                    FileOutputStream fileOutputStream = new FileOutputStream("result.txt")
            )
            {
                fileOutputStream.write(data);
            }
            catch(Exception e){
                System.err.println("exception" + e.getMessage());
            }



        }
    }
}
