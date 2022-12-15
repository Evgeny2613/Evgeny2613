package lessons.lesson28;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumer {
    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>(List.of(3.15, 3));
        numberList.add(16);
        addNumber(numberList);

        
    }

    public static void  printListOfNumbers(List<Number> numberList) {
        numberList.forEach(n -> System.out.println("number is: " + n));
    }

    public static void addNumber(List<? super Integer> list) {
        list.add(
                new Random().nextInt()
        );
    }
}
