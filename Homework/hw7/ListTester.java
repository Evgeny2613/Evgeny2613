/* Напишите функцию, принимающую на вход список строк и возвращающую список со строками длины больше 4.
Пример: ["Dasha", "Max", "Alena", "Sergey"] -> ["Dasha", "Alena", "Sergey"]
 */

package Homework.hw7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {

        System.out.println(lengthCheck(Arrays.asList("Dasha", "Max", "Alena", "Sergey")));

    }


    public static List<String> lengthCheck(List<String> names) {
        List<String> newNames = new ArrayList<>();
        for (String name: names) {
            if (name.length() > 4)
                newNames.add(name);
        }
        return newNames;
    }
}
