package lessons.lesson3.figure;

public abstract class FigureAbstract {
    public abstract double area(); // абстрактный - пустой метод

    public abstract double perimeter();

    public static double calculateArea(FigureAbstract [] figures) {
        double area = 0;
        for (FigureAbstract f: figures) {  // for each
            area += f.area();
        }
        return area;
    }
}
