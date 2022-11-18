package lessons.lesson23;

import java.io.BufferedReader;
import java.io.StringReader;
import java.io.StringWriter;

public class StringStreamTester {
    public static void main(String[] args) {
        String hello = "hello\nhow are you?\nI'm fine";
        StringReader stringReader = new StringReader(hello);
        BufferedReader bufferedReader = new BufferedReader(stringReader);

        bufferedReader.lines()
                .forEach(System.out::println);

        String result = "";
        StringWriter stringWriter = new StringWriter();
        stringWriter.append("hello");
        stringWriter.append("\n");
        stringWriter.append("to be or not to be");

        System.out.println(stringWriter.toString());
    }
}
