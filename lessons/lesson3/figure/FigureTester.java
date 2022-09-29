package lessons.lesson3.figure;

public class FigureTester {
    public static void main(String[] args) {
    Rectangle r1 = new Rectangle(10, 5);
    Rectangle r2 = new Rectangle(100, 150);
    Rectangle r3 = new Rectangle(50, 20);

    Ellipse e1 = new Ellipse(50, 40);

        System.out.println(r1.area() + r2.area() + r3.area() + e1.area());

        FigureAbstract [] dailyWork = {r1, r2, r3, e1};
        System.out.println(FigureAbstract.calculateArea(dailyWork));

        // полиморфизм - вызов по ссылке на базовый класс
        // переорпеделенной в производном классе функции

        FigureAbstract r4 = new Rectangle(10, 20);
        FigureAbstract e4 = new Ellipse(5, 6);
        r4.area(); // Rectangle::area()
        e4.perimeter(); //Ellipse::perimeter()

    }


}
