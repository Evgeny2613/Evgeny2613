package lessons.lesson22;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWriterTest {
    public static void main(String[] args) {
        try (
                FileOutputStream fos = new FileOutputStream("data.bin");
                DataOutputStream dos = new DataOutputStream(fos);
                )
        {
            dos.writeBoolean(true);
            dos.writeInt(123);
            dos.writeDouble(12.33);
            dos.writeUTF("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
