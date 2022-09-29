package Homework.HW2;

public class DateTester {
    public static void main(String[] args) {
            Date a = new Date(2000, 2, 29);
            System.out.println(a.check(a.getYear(), a.getMonth(), a.getDay()));

            Date b = new Date(2018, 8, 32);
            b.addDay();

            Date c = new Date(2018, 6, 30);
            c.addDay();


            Date d = new Date(2019, 5, 14);
            d.addDay();


            Date e = new Date(2019, 12, 31);
            e.addDay();
    }
}
