package lessons.lesson23.lesson22;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataReaderTester {
    public static void main(String[] args) {
        try (
                FileInputStream fis = new FileInputStream("data.bin");
                DataInputStream dis = new DataInputStream(fis);
        )
        {
            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

