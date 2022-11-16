package lessons.lesson22;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        try (
            FileInputStream fis = new FileInputStream("result.txt");
            FileOutputStream fos = new FileOutputStream("copy-of-result.txt")
        )
            {
               while ((i = fis.read()) != -1) {
                   fos.write(i);
               }
            }

        catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }
}
