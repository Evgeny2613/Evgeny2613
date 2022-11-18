package lessons.lesson23;

import Homework.hw19.Emp;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.PrintWriter;

public class JsonTester {
    public static void main(String[] args) {
        Emp emp = new Emp("Ivan Sergeev", 31, "analyst");
                /*
                { "name":"Ivan Sergeev", "age":31, "position":"analyst" }
                 */



//        serialize(emp, "ivan-sergeev.json");
        Emp ivan = deserializeEmp("ivan-sergeev.json");
        System.out.println(ivan);
    }

    public static Emp deserializeEmp(String filename) {
        Gson gson = new Gson();

        try (
                FileReader fileReader = new FileReader(filename);
                )
        {
            Emp e = gson.fromJson(fileReader, Emp.class);
            return e;
        }

        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public static void serialize(Object object, String filename) {
        Gson gson = new Gson();
        try (
                PrintWriter writer = new PrintWriter(filename);
                )
        {
            gson.toJson(object, writer);
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }
}
