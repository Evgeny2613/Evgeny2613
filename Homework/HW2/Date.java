package Homework.HW2;

//Напишите класс Date с приватными полями int day, int month, int year
// - сделайте геттеры и сеттеры и конструктор

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Напишите в классе Date методы проверки даты
    // static boolean check(int year, int month, int day) вернет true если дата валидная
    public static boolean check(int year, int month, int day) {
        if ((month == 1 | month == 3 | month == 5 | month == 7 | month == 8 | month == 10 | month == 12) && day <= 31)
            return true; // Moths with 31 days

       else if ((month == 4 | month == 6 | month == 9 | month == 11) && day <= 30) // Months with 30 days
            return true;

        else if (((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) | (year % 4 == 0 && year % 100 != 0)) && month == 2 && day <= 29)
            return true;
        else if (month == 2 && day <= 28)
            return true;
        else
            return false;
    }

    // * Напишите в классе Date метод void addDay() который добавляет к дате один день
    public void addDay() {
        if (check(year, month, day) == true) {
            day += 1;
            if (check(year, month, day) == true)
                System.out.println("New date is: " + year + "-" + month + "-" + day);
            else {
                day = 1;
                month += 1;
                if (check(year, month, day) == true)
                    System.out.println("New date is: " + year + "-" + month + "-" + day);
                else {
                    month = 1;
                    year += 1;
                    System.out.println("New date is: " + year + "-" + month + "-" + day);
                }
            }
        }
        else
            System.out.println("Invalid initial date");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
