package lessons.lesson22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputTest {
    public static void main(String[] args) throws IOException {
        Dog doggy = new Dog("Barbos", 5);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dog.bin"));
        oos.writeObject(doggy);
        oos.flush();
        oos.close();
    }
}
