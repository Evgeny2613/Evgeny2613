package Homework.hw23.Addition4;

public class Car {
    private String mark;
    private String model;
    private double fuelCapacity;
    private int horsepower;

    public Car(String mark, String model, double fuelCapacity, int horsepower) {
        this.mark = mark;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                ", horsepower=" + horsepower +
                '}';
    }
}
