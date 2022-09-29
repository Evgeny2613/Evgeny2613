package lessons.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        System.out.println(myList);
        myList.remove(1);
        System.out.println(myList);
        myList.addAll(Arrays.asList(5, 4, 3, 2, 1, 0));
        System.out.println(myList);
        System.out.println("Size " + myList.size());
        System.out.println("Second element is: " + myList.get(2));
    }
}
