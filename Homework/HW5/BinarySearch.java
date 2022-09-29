package Homework.HW5;

public class BinarySearch {
    public static void main(String[] args) {

    }

    public static int BinarySearch(int[] a, int value) {
        int minIndex = 0;
        int maxIndex = a.length - 1;
        while (minIndex <= maxIndex) {
            int middleIndex = (minIndex + maxIndex) / 2;
            if (a[middleIndex] < value) {
                minIndex = middleIndex + 1;
            } else if (a[middleIndex] > value) {
                maxIndex = middleIndex - 1;
            } else
                return middleIndex;
        }
        return -minIndex - 1;
    }

}
