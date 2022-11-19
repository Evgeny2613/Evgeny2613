package Homework.hw23.Addition4;

// Создайте класс, описывающий, например, легковую машину.
// Напишите функции которые сериализуют экземпляр этого класса в файл
// и десериализуют его из файла с помощью библиотеки Gson.

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;

public class CarSerializeDeserialize {
    public static void main(String[] args) {
        Car supra = new Car("Toyota", "Supra", 13.7, 255);

        serialize(supra, "supra.txt");
        System.out.println(deserialize("supra.txt"));
    }

    public static Car deserialize(String filename) {
        try (
                FileReader fileReader = new FileReader(filename);
                )
        {
            Gson gson = new Gson();
            return gson.fromJson(fileReader, Car.class);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static void serialize(Car car, String filename) {
        try (
                FileWriter fileWriter = new FileWriter(filename);
                )
        {
            Gson gson = new Gson();
            gson.toJson(car, fileWriter);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
