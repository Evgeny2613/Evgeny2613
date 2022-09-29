package lessons.lesson8.LinkedList;

public class MyTester {
    public static void main(String[] args) {
         MyLinkedList list = new MyLinkedList();
         list.add(12);
         list.add(-2);
        list.add(22);
        System.out.println(list);
        list.set(2, -14);
        System.out.println(list);
        System.out.println(list.get(2));
    }
}
