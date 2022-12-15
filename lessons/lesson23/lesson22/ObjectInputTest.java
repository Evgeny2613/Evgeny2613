package lessons.lesson23.lesson22;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dog.bin"));
        Dog d =(Dog) ois.readObject();
        System.out.println("dog: " + d.getName() + " age: " + d.getAge());
    }
}
