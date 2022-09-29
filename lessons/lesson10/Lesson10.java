package lessons.lesson10;

import java.util.HashSet;
import java.util.Set;

public class Lesson10 {
    public static void main(String[] args) {
        // Data Structure Set. HashSet

        Set<Point> points = new HashSet<>();
        Point p1 = new Point(10, 20);
        points.add(p1);

        points.add(p1);
        System.out.println(points.size());

        Point p2 = new Point(10, 20);
        points.add(p2);
        System.out.println(points.size());


        // Object.hashcode() - адресс экземпляра класса памяти
        // Object.equals() - по умолчанию сравнивает по адрессам в памяти
        System.out.println(p1.equals(p2)); // false

        Point1 pp1 = new Point1(10, 20);
        Point1 pp2 = new Point1(10, 20);

        System.out.println(pp1.equals(pp2));

        Set<Point1> pPoints = new HashSet<>();
        pPoints.add(pp1);
        pPoints.add(pp1);
        pPoints.add(pp2);

        System.out.println(pPoints.size());



        pp2.setX(123);
        pPoints.add(pp2);
        System.out.println(pPoints.size());



    }
}
