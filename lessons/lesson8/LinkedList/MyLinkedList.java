package lessons.lesson8.LinkedList;

import lessons.lesson6.list.MyList;

public class MyLinkedList implements MyList {


    private Node head;

    @Override
    public String toString() {
        String result = "[";
        Node n = head;

        while (n != null) {
            result += n.getValue();
            n = n.getNext();
            if (n != null)
                result += ", ";
        }
        result += "]";
        return result;
    }


    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }


        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

        private int size = 0;

    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean contains(int value) {
        Node n = head;
        while (n != null) {
            if (n.getValue() == value)
                return true;
            n = n.getNext();
        }
        return false;
    }

    @Override
    public void set(int index, int value) {
        Node n = getNodeByIndex(index);
        if (n != null)
            n.setValue(value);
    }

    @Override
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node n = head;
        while (n.getNext() != null)
            n = n.getNext();
        n.setNext(new Node(value));
    }

    private Node getNodeByIndex(int index) {
        Node n = head;
        for (int i = 0; i < index; i++) {
            if (n != null)
                n = n.getNext();
            else
                throw new IndexOutOfBoundsException();
        }
        return n;
    }

    @Override
    public void add(int index, int value) {
        if (index == 0) {
            Node prevHead = head;
            head = new Node(value);
        }
        else {
            Node prev = getNodeByIndex(index - 1);
            Node next = prev.getNext();
            Node newNode = new Node(value);
            prev.setNext(newNode);
        }
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            if (head == null)
                return;
            head = head.getNext();
            size--;
            return;
        }
        Node prev = getNodeByIndex(index - 1);
        if (prev != null) {
            Node next = prev.getNext();
            if (next != null)
                prev.setNext(next.getNext());
            size--;
        }
    }

    @Override
    public int get(int index) {
        Node n = getNodeByIndex(index);
        if (n == null)
            throw new IndexOutOfBoundsException();
        return n.getValue();
    }}
